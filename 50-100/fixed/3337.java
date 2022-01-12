@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent arg0) {
    long timePassed = (java.lang.System.currentTimeMillis()) - (start);
    if (timePassed > 5000) {
        stats.setStatValue(stat, value);
        buffed = false;
        buffTime.stop();
    }
}