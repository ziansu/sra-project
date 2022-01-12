@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    setItemLayout(R.layout.singing_list_item);
    setIntentActivity(org.fasola.fasolaminutes.SingingActivity.class);
    setRangeIndexer();
    long id = getActivity().getIntent().getLongExtra(org.fasola.fasolaminutes.EXTRA_ID, (-1));
    setQuery(C.Singing.selectList(C.Singing.name, C.Singing.startDate, C.Singing.location).distinct().sectionIndex(C.Singing.year).where(C.SongLeader.leaderId, "=", id));
    super.onViewCreated(view, savedInstanceState);
}