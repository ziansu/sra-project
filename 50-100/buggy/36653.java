@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View rootView = inflater.inflate(R.layout.fragment_graphing_one, container, false);
    graphOne = ((android.widget.LinearLayout) (rootView.findViewById(R.id.graphOne)));
    graphTwo = ((android.widget.LinearLayout) (rootView.findViewById(R.id.graphTwo)));
    if ((user) != null) {
        setDataLine(user);
        setDataPie(user);
    }
    return rootView;
}