public boolean[] getActionRep() {
    boolean[] keys = new boolean[myagent.actions.MarioAction.numberOfKeys];
    for (int km : keyMapping)
        keys[km] = true;
    
    return keys;
}