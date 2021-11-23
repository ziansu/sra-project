@java.lang.Override
public void mousePressed(java.awt.event.MouseEvent e) {
    java.lang.System.out.println("RORRRRRR");
    if ((clickClip) != null) {
        clickClip.setFramePosition(0);
        ((javax.sound.sampled.FloatControl) (clickClip.getControl(javax.sound.sampled.FloatControl.Type.MASTER_GAIN))).setValue((((((float) (JBattleships.game.getSoundVolume())) / 100.0F) * 80.0F) - 80.0F));
        clickClip.start();
    }
}