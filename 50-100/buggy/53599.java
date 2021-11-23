protected void buttonMap() {
    int button = 0;
    while (buttons.hasRemaining()) {
        byte value = buttons.get();
        java.lang.Integer action = controllerBinding.get(button);
        if (action != null) {
            input.Keyboard.setKey(action, value);
        }
        button++;
    } 
}