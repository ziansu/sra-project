@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    context = this.getActivity();
    PastHistoryFragmentView = inflater.inflate(R.layout.fragment_pasthistory, container, false);
    databaseAccess = databaseAccess.getInstance(context);
    HistoryList = ((android.widget.ListView) (PastHistoryFragmentView.findViewById(R.id.lvHistory)));
    readList();
    return PastHistoryFragmentView;
}