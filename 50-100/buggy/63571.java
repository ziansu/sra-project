public void run() {
    android.content.Intent intent = new android.content.Intent(self.cordova.getActivity(), com.example.acedeno.customcamera.CustomCameraActivity.class);
    android.util.Log.i("XXX", "iniciar Activity");
    if ((this.self.cordova) != null) {
        this.self.cordova.startActivityForResult(((org.apache.cordova.CordovaPlugin) (this.self)), intent, com.example.acedeno.customcamera.CustomCameraPlugin.GET_PICTURES_REQUEST);
    }
}