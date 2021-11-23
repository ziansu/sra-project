private void start() {
    this.timer = new java.util.Timer();
    timer.scheduleAtFixedRate(new application.Gui.TimingTask(), 0, 1);
}