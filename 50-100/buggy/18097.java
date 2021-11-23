@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View rootView = inflater.inflate(R.layout.fragment_newsitem_detail, container, false);
    if ((mItem) != null) {
        ((android.widget.TextView) (rootView.findViewById(R.id.newsitem_detail))).setText(java.lang.Integer.toString(mItem.getId()));
    }
    return rootView;
}