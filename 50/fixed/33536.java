@java.lang.Override
public void onStop() {
    super.onStop();
    this.getActivity().unbindService(mConnection);
}