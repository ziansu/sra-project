public void dispatchState(java.lang.Object msg) {
    if (inState)
        return ;
    
    inState = true;
    if (currentState.accepts(msg.type)) {
        currentState.update(msg);
    }
    inState = false;
}