public void fadeOut(java.lang.Runnable runnable) {
    if (fadingOut)
        return ;
    
    fadingOut = true;
    moon.startFalling();
    screenFadeActor.setColor(Color.CLEAR);
    addActor(screenFadeActor);
    screenFadeActor.addAction(com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(com.badlogic.gdx.scenes.scene2d.actions.Actions.color(Color.RED, 5.0F, Interpolation.exp5In), com.badlogic.gdx.scenes.scene2d.actions.Actions.run(runnable)));
}