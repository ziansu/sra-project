@java.lang.Override
public void run() {
    com.seniordesign.wolfpack.quizinator.WifiDirect.DeviceListFragment fragment = ((com.seniordesign.wolfpack.quizinator.WifiDirect.DeviceListFragment) (getFragmentManager().findFragmentById(R.id.frag_list)));
    if ((fragment != null) && (device != null)) {
        fragment.updateThisDevice(device);
    }
}