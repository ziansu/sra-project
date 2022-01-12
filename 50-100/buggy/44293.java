public void run() {
    android.util.Log.i(TAG, "pluginInitialize");
    this.context = this.cordova.getActivity().getApplicationContext();
    android.util.Log.i(TAG, "before Activity");
    android.content.Context context = cordova.getActivity().getApplicationContext();
    android.content.Intent intent = new android.content.Intent(context, co.vitallabs.plugin.IhealthActivity.class);
    intent.putExtra("mac", mAddress);
    cordova.getActivity().startActivity(intent);
}