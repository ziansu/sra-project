@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    int i = 1;
    android.view.View rootView = inflater.inflate(R.layout.fragment_detail, container, false);
    android.content.Intent intent = getActivity().getIntent();
    android.widget.TextView textView = ((android.widget.TextView) (rootView.findViewById(R.id.detail_text)));
    textView.setText(intent.getStringExtra(Intent.EXTRA_TEXT));
    return rootView;
}