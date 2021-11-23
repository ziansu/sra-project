public void popCurrentState() {
    states.pop();
    if (!(states.empty()))
        states.peek().resume();
    
}