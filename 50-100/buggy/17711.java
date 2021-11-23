@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    setHasOptionsMenu(true);
    if ((getArguments()) != null) {
        if ((sg.edu.nus.comp.orbital.synchro.SearchResultsFragment.query) == null) {
            sg.edu.nus.comp.orbital.synchro.SearchResultsFragment.query = getArguments().getString(sg.edu.nus.comp.orbital.synchro.SearchResultsFragment.GET_SEARCH_QUERY);
        }
        return inflater.inflate(R.layout.fragment_search_results, container, false);
    }else {
        return inflater.inflate(R.layout.error_layout, container, false);
    }
}