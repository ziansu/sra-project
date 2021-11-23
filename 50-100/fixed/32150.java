private void startAlbumAty() {
    android.content.Intent intent = new android.content.Intent(cordova.getActivity(), com.terrydr.eyeScope.AlbumAty.class);
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putBoolean("isPlugin", true);
    intent.putExtras(bundle);
    cordova.startActivityForResult(((org.apache.cordova.CordovaPlugin) (this)), intent, 6);
}