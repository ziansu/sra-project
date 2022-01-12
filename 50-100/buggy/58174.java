private void initializeViews() {
    mSemesterListAdapter = new blueprint.com.sage.admin.semester.adapters.SemesterListAdapter(getActivity(), mSemesters);
    mSemesterList.setAdapter(mSemesterListAdapter);
    mSemesterList.setEmptyView(mEmptyView);
    mSemesterList.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getActivity()));
    mRefreshSemesters.setOnRefreshListener(this);
    mEmptyView.setOnRefreshListener(this);
    getActivity().setTitle("Semesters");
}