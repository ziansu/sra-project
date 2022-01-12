public void onClose(ch.aiko.engine.graphics.Screen s) {
    isOpen = false;
    if ((input) != null)
        input.remove(s);
    
}