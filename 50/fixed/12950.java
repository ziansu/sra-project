public void save(android.content.Context context, java.lang.String filename, java.lang.String data) {
    save(context, filename, data.getBytes(), java.lang.System.currentTimeMillis());
}