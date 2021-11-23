@java.lang.Override
public void enter(org.newdawn.slick.GameContainer container, org.newdawn.slick.state.StateBasedGame game) throws org.newdawn.slick.SlickException {
    org.lwjgl.opengl.Display.setTitle(game.getTitle());
    itdelatrisu.opsu.Utils.getBackButton().resetHover();
    if (!(data.isGameplay())) {
        if (!(itdelatrisu.opsu.audio.MusicController.isTrackDimmed()))
            itdelatrisu.opsu.audio.MusicController.toggleTrackDimmed(0.5F);
        
    }else {
        itdelatrisu.opsu.audio.SoundController.playSound(SoundEffect.APPLAUSE);
        retryButton.resetHover();
        exitButton.resetHover();
    }
    itdelatrisu.opsu.audio.SoundController.destroyExtraClips();
}