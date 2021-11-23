@hugo.weaving.DebugLog
@java.lang.Override
public void onPause() {
    super.onPause();
    getActivity().unbindService(modelServiceConnection);
}