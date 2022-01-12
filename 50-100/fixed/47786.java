@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View rootView = inflater.inflate(R.layout.fragment_help, container, false);
    android.widget.TextView textView = ((android.widget.TextView) (rootView.findViewById(R.id.helpTextView)));
    textView.setText(android.text.Html.fromHtml(getString(R.string.help)));
    return rootView;
}