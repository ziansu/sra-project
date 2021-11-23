void onPlayerChanged() {
    updateStat();
    java.lang.System.out.println("onplayerchanged");
    getLoaderManager().restartLoader(tom.chinesesuperleague.MainFragment.STAT_LOADER_MAIN, null, this);
}