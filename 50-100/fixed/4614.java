public void addEvent(java.lang.String event) {
    event = event.trim();
    if (event.equals("")) {
        return ;
    }
    try {
        java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.FileWriter(monthFilePath, true));
        bw.newLine();
        bw.write((((date) + " ") + event));
        bw.close();
    } catch (java.io.IOException e) {
    }
    addEventToArray(event);
}