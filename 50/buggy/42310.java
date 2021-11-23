@java.lang.Override
public void onStop() {
    try {
        if (isMyServiceRunning())
            getActivity().unregisterReceiver(receiver);
        
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    super.onStop();
}