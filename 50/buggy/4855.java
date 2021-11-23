@java.lang.Override
public void onConnected(android.os.Bundle connectionHint) {
    connectAttempts = 0;
    if (loadSavedGame)
        loadSavedLevel();
    
    loadGameState();
}