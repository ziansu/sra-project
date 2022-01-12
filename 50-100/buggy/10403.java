@java.lang.Override
public void onDestroyView() {
    super.onDestroyView();
    org.dcxz.designdigger.app.App.getQueue().cancelAll(((org.dcxz.designdigger.fragment.MainFragment.TAG) + (subTag)));
    org.dcxz.designdigger.app.App.getQueue().cancelAll(ShotsAdapter.TAG);
    if ((receiver) != null) {
        getActivity().unregisterReceiver(receiver);
    }
}