@java.lang.Override
public void onPause() {
    if (serviceBound) {
        getActivity().unbindService(mConnection);
    }
    serviceBound = false;
    super.onPause();
}