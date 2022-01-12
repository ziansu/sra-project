private void applyEffect(java.lang.String pathOrData, final java.lang.String filterType, final double compressQuality, boolean isBase64Image, org.apache.cordova.CallbackContext callbackContext) {
    this.validateInput(pathOrData, filterType, isBase64Image);
    new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            android.graphics.Bitmap bmp = null;
            if (filterType.equals("aged"))
                bmp = applyAgedEffect(cordova.plugin.sts.image.filter.ImageFilter.editingGPUImage);
            
            processPicture(bmp, ((float) (compressQuality)), cordova.plugin.sts.image.filter.ImageFilter.JPEG);
        }
    }).start();
}