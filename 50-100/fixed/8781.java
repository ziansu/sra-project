@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View rootView = inflater.inflate(R.layout.fragment_base_pager, container, false);
    android.widget.TextView textView = ((android.widget.TextView) (rootView.findViewById(R.id.section_label)));
    textView.setText(getArguments().getInt(com.moana.carsharing.base.BasePagerActivity.PlaceholderFragment.ARG_SECTION_NUMBER));
    return rootView;
}