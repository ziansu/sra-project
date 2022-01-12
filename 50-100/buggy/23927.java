public void switchUI(boolean enable) {
    if (enable) {
        pref.setPrefEnabled(true);
        spinner.setEnabled(true);
        fab.setImageResource(android.R.drawable.ic_media_play);
    }else {
        pref.setPrefEnabled(false);
        spinner.setEnabled(false);
        fab.setImageResource(android.R.drawable.ic_media_pause);
    }
}