@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent event) {
    if (!(clockActive)) {
        timer.scheduleAtFixedRate(clock, 0, 1000);
    }
}