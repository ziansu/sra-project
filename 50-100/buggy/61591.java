@java.lang.Override
public void onPositionChange(com.cybor.gamehorse.core.Horse sender) {
    if ((onStateChangeListener) != null)
        onStateChangeListener.onStateChange(horse);
    
    if ((!(stepsAvailable(horse))) && ((onGameOverListener) != null))
        onGameOverListener.onGameOver(horse);
    
}