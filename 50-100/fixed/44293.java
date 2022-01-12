public void run() {
    android.util.Log.i(TAG, "pluginInitialize");
    android.content.Context context = this.cordova.getActivity().getApplicationContext();
    android.util.Log.i(TAG, "before Activity");
    android.content.Intent intent = new android.content.Intent(context, co.vitallabs.plugin.IhealthActivity.class);
    intent.putExtra("mac", mAddress);
    cordova.getActivity().startActivity(intent);
}