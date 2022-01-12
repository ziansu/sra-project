@java.lang.Override
public void Reset(boolean newGame) {
    Initialize();
    if (newGame)
        mTable.generateNewIdentities();
    
    com.kegelapps.palace.engine.Logic.log().info("------------------------");
    com.kegelapps.palace.engine.Logic.log().info("The game has been reset");
    com.kegelapps.palace.engine.Logic.log().info("------------------------");
    mDebug.Reset(newGame);
}