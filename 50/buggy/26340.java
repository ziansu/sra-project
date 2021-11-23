public void update() {
    pressedKeys.forEach(( keyCode) -> mapping.get(keyCode).doAction());
}