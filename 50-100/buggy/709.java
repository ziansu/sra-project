@java.lang.Override
public void onActivityCreated(android.os.Bundle aSavedState) {
    super.onActivityCreated(aSavedState);
    android.content.Context context = getActivity();
    forumRepo = com.ferg.awfulapp.forums.ForumRepository.getInstance(context);
    java.util.List<com.ferg.awfulapp.forums.Forum> forumList = forumRepo.getForumStructure().getAsList().build();
    forumListAdapter = com.ferg.awfulapp.forums.ForumListAdapter.getInstance(context, forumList, this, mPrefs);
    forumRecyclerView.setAdapter(forumListAdapter);
    forumRecyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(context));
    refreshForumList();
}