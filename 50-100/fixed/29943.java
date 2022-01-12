public void informHost() {
    if (com.vintagetechnologies.menschaergeredichnicht.implementation.ActualGame.getInstance().isLocalGame())
        return ;
    
    com.vintagetechnologies.menschaergeredichnicht.GameLogic gameLogic = ((com.vintagetechnologies.menschaergeredichnicht.GameLogic) (com.vintagetechnologies.menschaergeredichnicht.DataHolder.getInstance().retrieve(Network.DATAHOLDER_GAMELOGIC)));
    boolean isHost = gameLogic.isHost();
    if (!isHost) {
        ((com.vintagetechnologies.menschaergeredichnicht.GameLogicClient) (gameLogic)).sendToHost((((com.vintagetechnologies.menschaergeredichnicht.networking.Network.TAG_PLAYER_HAS_CHEATED) + (com.vintagetechnologies.menschaergeredichnicht.networking.Network.MESSAGE_DELIMITER)) + (java.lang.String.valueOf(cheated))));
    }
}