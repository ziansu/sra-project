public int addFileItem(com.celery.filedownloader.FileItem item) {
    files.add(item);
    java.util.Set<java.lang.String> nameList = pref.getStringSet(com.celery.filedownloader.DownloadManager.PREF_KEY, new java.util.HashSet<java.lang.String>());
    nameList.add(item.getUrlString());
    android.content.SharedPreferences.Editor editor = pref.edit();
    editor.putStringSet(com.celery.filedownloader.DownloadManager.PREF_KEY, nameList);
    editor.commit();
    java.lang.System.out.println(("add File Item and total count is: " + (nameList.size())));
    return files.indexOf(item);
}