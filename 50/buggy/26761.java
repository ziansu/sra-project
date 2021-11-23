@java.lang.Override
protected void messageReceived(net.beadsproject.beads.core.Bead bead) {
    sleigher.zombie.ZombieSleigher.backgroundSound = new sleigher.zombie.Sound("src/res/sounds/background.mp3");
    sleigher.zombie.ZombieSleigher.backgroundSound.sample.setLoopType(SamplePlayer.LoopType.LOOP_FORWARDS);
    sleigher.zombie.ZombieSleigher.backgroundSound.play();
    this.pause(true);
}