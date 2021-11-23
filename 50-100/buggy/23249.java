@java.lang.Override
public void activate(int whichToActivate) {
    if (((state) == 0) && ((leverAngle) == 40)) {
        state = 1;
        nextState = 2;
        com.hurryup.game.network.GameClient.sendMessage(serialize(true));
    }else
        if (((state) == 2) && ((connection[connectionValue]) != null)) {
            connection[0].activate(connectionValue);
            state = 3;
        }
    
}