@java.lang.Override
public void onActivityCreated(android.os.Bundle aSavedState) {
    super.onActivityCreated(aSavedState);
    android.content.Context context = getActivity();
    forumRepo = com.ferg.awfulapp.forums.ForumRepository.getInstance(context);
    forumListAdapter = com.ferg.awfulapp.forums.ForumListAdapter.getInstance(context, new java.util.ArrayList<com.ferg.awfulapp.forums.Forum>(), this, mPrefs);
    forumRecyclerView.setAdapter(forumListAdapter);
    forumRecyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(context));
}