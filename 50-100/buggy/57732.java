@java.lang.Override
public void show() {
    super.show();
    de.caffeineaddicted.sgl.SGL.provide(de.caffeineaddicted.ld36.screens.BackgroundScreen.class).setBackground("kenney/background.png");
    if ((stage().getActor(ACTOR_HUD)) != null)
        stage().getActor(ACTOR_HUD).setVisible(drawHud);
    
    if (!(demo)) {
        registerInputListener(new de.caffeineaddicted.ld36.input.GameInputProcessor(this));
    }
}