public void handleInput(float dt) {
    if (playBtn.isPressed())
        game.setScreen(new com.tq.doodle.Screens.PlayScreen(game));
    
    if (optionsBtn.isPressed()) {
        game.setScreen(new com.tq.doodle.Screens.OptionsScreen(game));
        java.lang.System.out.println("Ola");
    }
}