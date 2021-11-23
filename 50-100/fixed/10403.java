@java.lang.Override
public void onDestroyView() {
    super.onDestroyView();
    org.dcxz.designdigger.app.App.getQueue().cancelAll(subTag);
    org.dcxz.designdigger.app.App.getQueue().cancelAll(ShotsAdapter.TAG);
    if ((receiver) != null) {
        getActivity().unregisterReceiver(receiver);
    }
}