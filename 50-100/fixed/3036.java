@java.lang.Override
protected void bindView(android.view.View view) {
    super.bindView(view);
    mGroupMembersAdapter = new fr.sims.coachingproject.ui.adapter.GroupMembersAdapter(getActivity(), mGroupId);
    mGroupMembersList = ((android.support.v7.widget.RecyclerView) (view.findViewById(R.id.group_members_list)));
    mGroupMembersList.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getActivity()));
    mGroupMembersList.setAdapter(mGroupMembersAdapter);
    mGroupMembersAdapter.setOnUserClickListener(this);
}