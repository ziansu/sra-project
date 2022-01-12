@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    final android.widget.ScrollView scrollView = ((android.widget.ScrollView) (getActivity().findViewById(R.id.aboutScroll)));
    scrollView.fullScroll(View.FOCUS_DOWN);
}