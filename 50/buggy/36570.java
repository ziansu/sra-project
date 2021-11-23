public void nextTurn() {
    if ((active) == (com.engine.Engine.ATTACKER)) {
        active = com.engine.Engine.DEFENDER;
    }else {
        active = com.engine.Engine.ATTACKER;
        newTurn();
    }
    turn(active);
}