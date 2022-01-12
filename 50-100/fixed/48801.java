@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.os.Bundle args = getArguments();
    mIsHumanVsHuman = args.getBoolean("isHvH");
    mGame = me.dacol.marco.mancala.gameLib.gameController.Game.getInstance();
    mGame.setup();
    addPlayers();
}