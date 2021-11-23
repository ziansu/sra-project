private void writeData() {
    try (java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(file, true), "UTF-8"))) {
        writer.write(((((de.neffez.timetrack.util.DateUtil.getTodayFormatted(TimeTrackConstants.DE_DATE)) + " ") + (timeSinceStartup.getText())) + "\n"));
        appendTextArea("Data written. You may exit now.");
    } catch (java.io.IOException e) {
        appendTextArea(("Error writing the data: " + (e.getMessage())));
        e.printStackTrace();
    }
}