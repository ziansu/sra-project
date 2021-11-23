public void buttonEvent(java.lang.String event) {
    if (event.equals("Rock Dodger")) {
        game.menu.setState("Game");
        setText("");
    }else
        if (event.equals("Instructions")) {
            game.menu.setState("Game");
            setText("");
        }
    
}