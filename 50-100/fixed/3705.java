@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.util.Log.d(LOG_TAG, java.lang.Thread.currentThread().getStackTrace()[2].getMethodName());
    adapter = new com.example.sun1.popularmovie.poster_adapter(getContext(), R.layout.poster_item_layout, movieInfoList);
    android.view.View rootView = inflater.inflate(R.layout.activity_main_fragment, container, false);
    android.widget.GridView gridView = ((android.widget.GridView) (rootView.findViewById(R.id.gridview)));
    gridView.setAdapter(adapter);
    return rootView;
}