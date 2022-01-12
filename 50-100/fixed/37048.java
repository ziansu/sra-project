@java.lang.Override
public void clicked(org.newdawn.slick.GameContainer gc) {
    cp.setGameProcessorState(false);
    cp.getGp().setStarted(false);
    setGameButton(false);
    backgroundOn = true;
    cp.setCurrentAudio(cp.getAudioFiles().get(CoreProcessor.MENU_AUDIO), true);
    setMenuButton(true);
}