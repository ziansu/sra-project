@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.screen_sub_news, container, false);
    ((android.widget.TextView) (view.findViewById(R.id.newsText))).setText(tabTitle);
    return view;
}