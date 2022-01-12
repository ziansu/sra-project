public void addComponents() {
    ClockIn.addActionListener(new ClockInOut.ClockInListener());
    ClockOut.addActionListener(new ClockInOut.ClockOutListener());
    clockPanel.addExistingButton(ClockIn, new CoordPoint(300, 0), new Dimensions(60, 150));
    clockPanel.addExistingButton(ClockOut, new CoordPoint(750, 0), new Dimensions(60, 150));
    numPad = new NumPad(clockPanel);
}