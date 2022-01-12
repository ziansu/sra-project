@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.repository_list_layout, container, false);
    mListView.setAdapter(repositoryListAdapter);
    getLoaderManager().initLoader(com.ant.github.fragments.RepositoryListFragment.LOADER_ID, null, this);
    butterknife.ButterKnife.bind(this, view);
    return view;
}