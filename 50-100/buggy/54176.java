@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View v = inflater.inflate(R.layout.fragment_search, container, false);
    loadingProgressBar = ((android.widget.ProgressBar) (v.findViewById(R.id.progressBar)));
    loadingProgressBar.setVisibility(View.INVISIBLE);
    handler = new android.os.Handler();
    searchResultsList = new java.util.ArrayList<>();
    return v;
}