void showSuggestions(final java.lang.String searchTerm) {
    currentEnteredText = searchTerm;
    if ((!(queryRunning)) && (citiesDatabaseHandler.isDatabaseOpen())) {
        queryRunning = true;
        citiesDatabaseHandler.getSuggestions(searchTerm);
    }else {
        final android.os.Handler handler = new android.os.Handler();
        handler.postDelayed(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                showSuggestions(currentEnteredText);
            }
        }, 200);
    }
}