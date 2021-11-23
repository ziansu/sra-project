public void update() {
    for (java.lang.Integer keyCode : pressedKeys)
        mapping.get(keyCode).doAction();
    
}