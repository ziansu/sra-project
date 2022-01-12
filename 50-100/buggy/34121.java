public void startGame() {
    speak("src/music/Countdown5.wav");
    countdown(5);
    java.util.ArrayList<fi.antiik.hockeygamehandler.logic.Updatable> updatables = new java.util.ArrayList<>();
    updatables.add(this.gui);
    updatables.add(this.logic);
    this.timer = new javax.swing.Timer(1000, new fi.antiik.hockeygamehandler.gui.TimerListener(updatables));
    timer.setInitialDelay(1000);
    timer.start();
}