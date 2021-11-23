private void saveFragment(java.lang.String fragName) {
    context.getSharedPreferences(VideoActivity.PREFERENCE, this.context.MODE_PRIVATE).edit().putBoolean(com.example.disney.myapplication.VideoAdapter.key, true).commit();
}