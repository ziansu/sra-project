@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.content.Intent i = getActivity().getIntent();
    currentIdEvent = ((java.lang.String) (i.getSerializableExtra("CurrentIdEvnet")));
    android.util.Log.d("CurrentIdEvnet22:", currentIdEvent);
    if ((getArguments()) != null) {
        mParam1 = getArguments().getString(com.example.nava.a2003.My_Events.MainInviteFragment.ARG_PARAM1);
        mParam2 = getArguments().getString(com.example.nava.a2003.My_Events.MainInviteFragment.ARG_PARAM2);
    }
}