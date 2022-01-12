@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    mAdapter = new com.android1.homework3.msg.adapter.ChannelListAdapter(getActivity(), mChannels);
    setListAdapter(mAdapter);
}