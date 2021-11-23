@java.lang.Override
public void deactivate(int whichToDeactivate) {
    if (((state) == 3) && ((leverAngle) == (-40))) {
        state = 1;
        nextState = 2;
        com.hurryup.game.network.GameClient.sendMessage(serialize(false));
    }else
        if (((state) == 2) && ((connection[0]) != null)) {
            connection[0].deactivate(connectionValue);
            state = 0;
        }
    
}