void setupRequestHeaders() {
    mConnection.setRequestProperty("User-Agent", "velocity-android-http-client");
    if (((mBuilder.contentType) != null) && (!(mBuilder.contentType.equalsIgnoreCase(Velocity.ContentType.TEXT.toString()))))
        mConnection.setRequestProperty("Content-Type", mBuilder.contentType);
    
    if (!(mBuilder.headers.isEmpty())) {
        for (java.lang.String key : mBuilder.headers.keySet())
            mConnection.setRequestProperty(key, mBuilder.headers.get(key));
        
    }
}