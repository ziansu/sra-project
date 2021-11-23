@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((getArguments()) != null) {
        mParam1 = getArguments().getString(com.android.meddata.Fragments.MyHandoffPatientFragment.ARG_PARAM1);
        mParam2 = getArguments().getString(com.android.meddata.Fragments.MyHandoffPatientFragment.ARG_PARAM2);
        if (mParam1.equalsIgnoreCase("handoff")) {
            isHandOff = true;
        }
    }
    android.content.IntentFilter messageFilter = new android.content.IntentFilter(android.content.Intent.ACTION_SEND);
    com.android.meddata.Fragments.MyHandoffPatientFragment.MessageReceiver messageReceiver = new com.android.meddata.Fragments.MyHandoffPatientFragment.MessageReceiver();
    android.support.v4.content.LocalBroadcastManager.getInstance(getActivity()).registerReceiver(messageReceiver, messageFilter);
}