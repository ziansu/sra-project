public void update(float delta) {
    totalTime += delta;
    for (com.osreboot.ridhvl.menu.HvlComponent c : components)
        c.metaUpdate(delta);
    
}