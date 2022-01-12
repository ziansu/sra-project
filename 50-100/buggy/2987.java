@java.lang.Override
public void handleMessage(java.lang.String msg) {
    if (msg.equals(NetworkMessages.userKicked)) {
        closeClient();
        showUI(true);
    }else
        if (msg.equals(NetworkMessages.userAccepted)) {
            java.lang.System.out.println("accepted");
            showUI(false);
        }else
            if (msg.equals(NetworkMessages.startGame)) {
                currentState = backend.GameState.WAITING_FOR_ANSWERS;
            }
        
    
}