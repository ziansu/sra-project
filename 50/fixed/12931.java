private void start() {
    timer = new java.util.Timer();
    timer.scheduleAtFixedRate(new application.Gui.TimingTask(), 0, 1);
}