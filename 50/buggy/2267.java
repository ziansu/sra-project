@java.lang.Override
public void run() {
    android.util.Log.d(com.seniordesign.wolfpack.quizinator.Activities.HostGameActivity.TAG, "updateThisDevice: Runnable: update device in list fragment");
    com.seniordesign.wolfpack.quizinator.WifiDirect.DeviceListFragment fragment = ((com.seniordesign.wolfpack.quizinator.WifiDirect.DeviceListFragment) (getFragmentManager().findFragmentById(R.id.frag_list)));
    if (fragment != null) {
        fragment.updateThisDevice(device);
    }
}