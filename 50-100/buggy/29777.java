@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    setItemLayout(R.layout.leader_list_item);
    setIntentActivity(org.fasola.fasolaminutes.SongActivity.class);
    long id = getActivity().getIntent().getLongExtra(org.fasola.fasolaminutes.EXTRA_ID, (-1));
    setQuery(C.Song.selectList(C.Song.fullName, C.LeaderStats.leadCount.format("'(' || {column} || ')'")).where(C.LeaderStats.leaderId, "=", id).order(C.LeaderStats.leadCount, "DESC", C.Song.pageSort, "ASC"));
    super.onViewCreated(view, savedInstanceState);
}