@java.lang.Override
protected RecyclerView.Adapter initializeAdapter() {
    mAdapter = new app.studentorganizer.adapters.SubjectListAdapter(this, mSubjects);
    return mAdapter;
}