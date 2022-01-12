@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.util.Log.d(org.interactiverobotics.headset_launcher.BluetoothHeadsetFragment.TAG, "Create View");
    mView = inflater.inflate(R.layout.fragment_bluetooth_headset, container, false);
    final android.content.Intent intent = new android.content.Intent(mView.getContext(), org.interactiverobotics.headset_launcher.BluetoothHeadsetMonitorService.class);
    intent.putExtra("CALLBACK", mCallbackMessenger);
    mView.getContext().bindService(intent, mConnection, Context.BIND_AUTO_CREATE);
    return mView;
}