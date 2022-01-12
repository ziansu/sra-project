private void updateStat() {
    tom.chinesesuperleague.FetchStatTask statTask = new tom.chinesesuperleague.FetchStatTask(getActivity());
    java.lang.String player = tom.chinesesuperleague.Utility.getPreferredPlayer(getActivity());
    getLoaderManager().restartLoader(tom.chinesesuperleague.FetchFragment.STAT_LOADER, null, this);
    statTask.execute(player);
}