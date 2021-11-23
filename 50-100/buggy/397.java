@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    me.dacol.marco.mancala.logging.Logger.v(me.dacol.marco.mancala.gameUI.board.BoardFragment.LOG_TAG, "activityCreated");
    mGame.getTurnContext().addObserver(this);
    me.dacol.marco.mancala.statisticsLib.StatisticsHelper statisticsHelper = me.dacol.marco.mancala.statisticsLib.StatisticsHelper.getInstance(getActivity());
    mGame.getTurnContext().addObserver(statisticsHelper);
    mGame.start(savedInstanceState);
}