@java.lang.Override
public void onPositionChange(com.cybor.gamehorse.core.Horse sender) {
    if ((onStateChangeListener) != null)
        onStateChangeListener.onStateChange(sender);
    
    if ((!(stepsAvailable(sender))) && ((onGameOverListener) != null))
        onGameOverListener.onGameOver(sender);
    
}