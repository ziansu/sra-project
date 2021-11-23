public void update(float dt) {
    incrementLife(dt);
    if ((currentLife) >= (lifetime))
        dispose();
    
}