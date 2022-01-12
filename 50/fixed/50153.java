@java.lang.Override
public void onStop() {
    getActivity().getActionBar().setDisplayHomeAsUpEnabled(false);
    super.onStop();
}