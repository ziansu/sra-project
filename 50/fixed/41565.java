public void actionPerformed(java.awt.event.ActionEvent evt) {
    (clockTick)++;
    clockTime = ((double) (clockTick)) / 10.0;
    timeString = new java.lang.Double(clockTime).toString();
    displayTime.setText(timeString);
}