@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View rootView = inflater.inflate(R.layout.fragment_workflow_run_history, container, false);
    mRecyclerView = ((android.support.v7.widget.RecyclerView) (rootView.findViewById(android.R.id.list)));
    mRecyclerView.setHasFixedSize(true);
    mRecyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getActivity()));
    getActivity().getLoaderManager().initLoader(1, savedInstanceState, this);
    return rootView;
}