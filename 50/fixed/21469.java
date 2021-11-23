@java.lang.Override
public void terminate() {
    if (!(isPreviousMarker())) {
        mView.stopService(com.gerus.pulpomatic.navigator.Navigator.getService(getContext()));
    }
}