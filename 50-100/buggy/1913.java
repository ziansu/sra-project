public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    com.google.zxing.integration.android.IntentResult scanResult = com.google.zxing.integration.android.IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
    if (scanResult != null) {
        java.lang.String url = scanResult.getContents();
        new com.pokemonshowdown.app.TeamBuildingActivity.PastebinTask(com.pokemonshowdown.app.TeamBuildingActivity.PastebinTaskId.IMPORT).execute(url);
    }else {
        super.onActivityResult(requestCode, resultCode, data);
    }
}