protected void onClickUser(android.view.View view) {
    android.content.Intent intent = com.foursquare.android.nativeoauth.FoursquareOAuth.getConnectIntent(this, com.elmexicano.lsteamer.xlocation.MainActivity.CLIENT_ID);
    if (com.foursquare.android.nativeoauth.FoursquareOAuth.isPlayStoreIntent(intent)) {
        com.elmexicano.lsteamer.xlocation.MainActivity.toastMessage(this, getString(R.string.app_not_installed_message));
        startActivity(intent);
    }else {
        startActivityForResult(intent, com.elmexicano.lsteamer.xlocation.MainActivity.REQUEST_CODE_FSQ_CONNECT);
    }
}