private void prepareData(int sessionId) {
    if (!(com.media2359.mediacorpspellinggame.factory.GameRepo.getInstance().isDataReady())) {
        final android.app.ProgressDialog dialog = android.app.ProgressDialog.show(this, "Preparing...", "Please wait...", true, false);
        com.media2359.mediacorpspellinggame.factory.GameRepo.getInstance().loadData(sessionId, this, new com.media2359.mediacorpspellinggame.factory.GameRepo.GameDataCallback() {
            @java.lang.Override
            public void onLoadingFinished(java.util.List<com.media2359.mediacorpspellinggame.data.Section> games, java.util.List<com.media2359.mediacorpspellinggame.data.Question> questions) {
                dialog.dismiss();
            }
        });
    }
}