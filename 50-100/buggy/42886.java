@java.lang.Override
public void doAction() {
    input[0] = destinationBox.getText();
    input[1] = departureLocationBox.getText();
    input[2] = dateOfDepartureBox.getText();
    flc.setDateOfDeparture(input[2]);
    flc.setDepartureIATA(input[1]);
    flc.setArrivalIATA(input[0]);
    sendToGoogle(input, textValues);
    results.appendLine(flc.getArrivalIATA());
    guiScreen.showWindow(guiOutput, GUIScreen.Position.FULL_SCREEN);
}