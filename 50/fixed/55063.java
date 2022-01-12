void onPlayerChanged() {
    updateStat();
    getLoaderManager().restartLoader(tom.chinesesuperleague.MainFragment.STAT_LOADER_MAIN, null, this);
}