private void start() {
    if ((timer) == null) {
        timer = new java.util.Timer();
        timer.scheduleAtFixedRate(new application.Gui.TimingTask(), 0, 1);
    }
}