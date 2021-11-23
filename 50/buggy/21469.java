@java.lang.Override
public void terminate() {
    if (!(isPreviousMarker())) {
        android.util.Log.e("MUEReeeeeee", "servicio");
        mView.stopService(com.gerus.pulpomatic.navigator.Navigator.getService(getContext()));
    }
}