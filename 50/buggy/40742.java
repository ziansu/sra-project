@java.lang.Override
public void onPause() {
    super.onPause();
    presenter.unbindService(getActivity().getApplicationContext());
}