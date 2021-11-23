@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    new iso.piotrowski.marek.nyndro.statistics.StatsPresenter(this, iso.piotrowski.marek.nyndro.DataSource.DataSource.getInstance());
    statsRecyclerView = ((android.support.v7.widget.RecyclerView) (inflater.inflate(R.layout.fragment_stats, container, false)));
    calculateStatsInBackground(false);
    return statsRecyclerView;
}