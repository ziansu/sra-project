@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_tutorial, container, false);
    android.widget.TextView tvNamesList = ((android.widget.TextView) (view.findViewById(R.id.text_tuto_materials)));
    tvNamesList.setText(android.text.Html.fromHtml(getString(R.string.tuto_materials)));
    return view;
}