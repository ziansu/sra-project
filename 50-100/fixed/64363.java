@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_drawn_paths, container, false);
    mDrawnPathList = ((android.widget.ListView) (view.findViewById(R.id.list)));
    mContext = getActivity();
    mAdapter = null;
    com.uw.hcde.fizzlab.trace.database.ParseDataFactory.retrieveMyWalkedPaths(com.parse.ParseUser.getCurrentUser(), this);
    return view;
}