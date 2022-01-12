public synchronized void start() {
    if (running)
        return ;
    
    manager = new com.wolf.engine.core.states.StateManager();
    keyboard = new com.wolf.engine.core.input.Keyboard();
    mouse = new com.wolf.engine.core.input.Mouse(this);
    thread = new java.lang.Thread(this);
    thread.start();
}