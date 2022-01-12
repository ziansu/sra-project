public void fadeOut(java.lang.Runnable runnable) {
    if (fadingOut)
        return ;
    
    fadingOut = true;
    addActor(moon);
    moon.startFalling();
    screenFadeActor.addAction(com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(com.badlogic.gdx.scenes.scene2d.actions.Actions.color(Color.CLEAR), com.badlogic.gdx.scenes.scene2d.actions.Actions.color(Color.RED, 5.0F, Interpolation.exp5In), com.badlogic.gdx.scenes.scene2d.actions.Actions.run(runnable)));
    addActor(screenFadeActor);
}