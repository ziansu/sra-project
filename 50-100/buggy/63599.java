private int deleteFirstActionNamed(int pos, java.lang.String actionId) {
    while (!(((list.getItems().get(pos)) instanceof com.bladecoder.engine.actions.AbstractControlAction) || (getOrCreateControlActionId(((com.bladecoder.engine.actions.AbstractControlAction) (list.getItems().get(pos)))).equals(actionId))))
        pos++;
    
    com.bladecoder.engine.actions.Action e2 = list.getItems().removeIndex(pos);
    parent.getActions().remove(e2);
    return pos;
}