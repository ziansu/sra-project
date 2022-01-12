@java.lang.Override
public void attachChampions(java.util.List<pl.patrykzygo.pocketleague.pojo.ChampionDto> champions) {
    this.champions = champions;
    adapter.setChampions(champions);
    adapter.setOnChampionClickListener(this);
    championsRecyclerView.setAdapter(adapter);
    championsRecyclerView.addItemDecoration(new android.support.v7.widget.DividerItemDecoration(championsRecyclerView.getContext(), android.support.v7.widget.DividerItemDecoration.VERTICAL));
    championsRecyclerView.getAdapter().notifyDataSetChanged();
    championsRecyclerView.setNestedScrollingEnabled(false);
}