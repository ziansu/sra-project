private void restoreAllFileItems() {
    java.util.Set<java.lang.String> nameList = pref.getStringSet(com.celery.filedownloader.DownloadManager.PREF_KEY, null);
    if (nameList != null) {
        for (java.lang.String urlString : nameList) {
            java.lang.System.out.println(("restore All FileItems: " + urlString));
            com.celery.filedownloader.FileItem fileItem = new com.celery.filedownloader.FileItem(urlString);
            files.add(fileItem);
        }
    }
}