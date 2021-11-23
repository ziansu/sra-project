@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    dbController = new princetronics.assignment3.DBController(getActivity());
    android.view.View root = inflater.inflate(R.layout.fragment_expenses, container, false);
    expensesListView = ((android.widget.ListView) (root.findViewById(R.id.list_expense)));
    expensesListView.setAdapter(adapter);
    setHasOptionsMenu(true);
    return root;
}