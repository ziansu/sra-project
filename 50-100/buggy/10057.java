@java.lang.Override
protected java.lang.String doInBackground(byte[]... photoData) {
    try {
        photoFile = this.createFile();
        io.github.data4all.logger.Log.d(io.github.data4all.handler.CapturePictureHandler.TAG, ("Picturepath:" + (photoFile.getPath())));
        final java.io.FileOutputStream fos = new java.io.FileOutputStream(photoFile.getPath());
        fos.write(photoData[0]);
        fos.flush();
        fos.close();
    } catch (java.io.IOException ex) {
        io.github.data4all.logger.Log.e(io.github.data4all.handler.CapturePictureHandler.TAG, "Fail to save picture", ex);
    }
    return "successful";
}