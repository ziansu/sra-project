public void initializeViews() {
    mAnnouncementsList.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getActivity()));
    mAnnouncementsList.setEmptyView(mEmptyView);
    mAnnouncementsList.setProgressBar(mProgressBar);
    mAdapter = new blueprint.com.sage.announcements.adapters.AnnouncementsListAdapter(mAnnouncements, getActivity(), getParentFragment());
    mAnnouncementsList.setAdapter(mAdapter);
    mAdapter.notifyDataSetChanged();
    mEmptyView.setOnRefreshListener(this);
    mAnnouncementsRefreshView.setOnRefreshListener(this);
}