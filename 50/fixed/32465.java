protected void openOptions() {
    canrefresh = false;
    android.content.Intent intent = new android.content.Intent(getBaseContext(), com.lgallardo.youtorrentcontroller.OptionsActivity.class);
    startActivityForResult(intent, com.lgallardo.youtorrentcontroller.MainActivity.OPTION_CODE);
}