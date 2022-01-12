private void updateUI() {
    boolean enableButtons = (com.facebook.AccessToken.getCurrentAccessToken()) != null;
    com.facebook.Profile profile = com.facebook.Profile.getCurrentProfile();
    if (enableButtons && (profile != null)) {
        android.content.Intent intent = new android.content.Intent(getActivity(), com.ekaterinachubarova.films1.ui.activity.MainActivity.class);
        startActivity(intent);
    }
}