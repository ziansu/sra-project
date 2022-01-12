public void saveToDisk(java.util.ArrayList<com.dalexiv.yandextest.musicbrowser.dataModel.Performer> listForSave) {
    try {
        java.io.BufferedOutputStream bos = new java.io.BufferedOutputStream(new java.io.FileOutputStream(file));
        bos.write(com.dalexiv.yandextest.musicbrowser.net.DiskCache.gson.toJson(listForSave).getBytes());
        bos.flush();
        bos.close();
    } catch (java.io.IOException e) {
        android.util.Log.e(com.dalexiv.yandextest.musicbrowser.net.DiskCache.TAG, "Saving to disk failed");
        e.printStackTrace();
    }
}