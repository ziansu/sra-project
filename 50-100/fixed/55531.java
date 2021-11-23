public synchronized void serialEvent(SerialPortEvent oEvent) {
    if ((oEvent.getEventType()) == (SerialPortEvent.DATA_AVAILABLE)) {
        try {
            java.lang.String inputLine = in.readLine();
            input = new java.lang.String(inputLine);
            java.lang.System.out.println(input);
        } catch (java.lang.Exception e) {
        }
    }
}