public synchronized void start() {
    if (running)
        return ;
    
    sp = new com.wolf.engine.core.media.SpriteSystem();
    keyboard = new com.wolf.engine.core.input.Keyboard();
    mouse = new com.wolf.engine.core.input.Mouse(this);
    display = new com.wolf.engine.core.Display(this);
    renderer = new com.wolf.engine.core.Renderer(this, sp);
    thread = new java.lang.Thread(this);
    thread.start();
}