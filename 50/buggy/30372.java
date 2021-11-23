public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((ChronoTimer.isOn) == true) {
        display.setText(ChronoTimer.current.doPrint());
    }
}