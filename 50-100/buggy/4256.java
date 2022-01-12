private void saveDownloadTotalSize(java.lang.String url, long totalSize) {
    android.content.SharedPreferences sp = org.lzh.framework.updatepluginlib.UpdateConfig.getConfig().getContext().getSharedPreferences(org.lzh.framework.updatepluginlib.business.DefaultDownloadWorker.KEY_DOWN_SIZE, Context.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = sp.edit();
    editor.putLong((url + "_total_size"), totalSize);
    editor.apply();
}