@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    me.dacol.marco.mancala.logging.Logger.v(me.dacol.marco.mancala.gameUI.board.BoardFragment.LOG_TAG, "oncreate");
    super.onCreate(savedInstanceState);
    android.os.Bundle args = getArguments();
    mIsHumanVsHuman = args.getBoolean("isHvH");
    mGame = me.dacol.marco.mancala.gameLib.gameController.Game.getInstance();
    mGame.setup();
    addPlayers();
}