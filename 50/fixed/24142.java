public static synchronized com.qwasi.sdk.QwasiLocationManager getInstance() {
    return (com.qwasi.sdk.QwasiLocationManager.mInstance) == null ? new com.qwasi.sdk.QwasiLocationManager() : com.qwasi.sdk.QwasiLocationManager.mInstance;
}