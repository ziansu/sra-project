@java.lang.Override
public void onPause() {
    super.onDestroyView();
    if ((MainActivity.IS_TABLET) && ((rootView.findViewById(R.id.right_container)) == null)) {
        getActivity().getSupportFragmentManager().popBackStack();
    }
}