@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_entry_list, container, false);
    _currentJournal = ((au.edu.uts.redylog.redylog.Models.Journal) (getArguments().getSerializable(getString(R.string.bundle_journal_key))));
    setupReferences(view);
    setupRecyclerView(view);
    setupView();
    updateList();
    mListener.updateTitle(_currentJournal.get_title());
    return view;
}