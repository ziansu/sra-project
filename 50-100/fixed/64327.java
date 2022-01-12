private void saveDownloadSize(java.lang.String url, long size) {
    android.content.SharedPreferences sp = org.lzh.framework.updatepluginlib.UpdateConfig.getConfig().getContext().getSharedPreferences(org.lzh.framework.updatepluginlib.business.DefaultDownloadWorker.KEY_DOWN_SIZE, Context.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = sp.edit();
    editor.putLong(url, size);
    editor.commit();
}