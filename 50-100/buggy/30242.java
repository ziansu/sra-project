public void getImage(int srcType, int returnType, int encodingType) {
    android.content.Intent intent = new android.content.Intent(this.cordova.getActivity().getApplicationContext(), org.apache.cordova.camera.GalleryActivity.class);
    if ((this.cordova) != null) {
        this.cordova.startActivityForResult(((org.apache.cordova.CordovaPlugin) (this)), android.content.Intent.createChooser(intent, new java.lang.String(title)), ((((srcType + 1) * 16) + returnType) + 1));
    }
}