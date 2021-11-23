@java.lang.Override
public android.view.View onCreateView(org.opendatakit.tables.fragments.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    theView = new android.widget.LinearLayout(getActivity());
    android.widget.TextView textView = new android.widget.TextView(getActivity());
    textView.setText(getString(R.string.error_accessing_database));
    theView.addView(textView);
    this.container = container;
    return theView;
}