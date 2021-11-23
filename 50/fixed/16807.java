@java.lang.Override
public void onDetach() {
    super.onDetach();
    getActivity().unregisterReceiver(quickReceiver);
}