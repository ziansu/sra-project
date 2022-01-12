public synchronized void close() throws java.io.IOException {
    edu.ncku.uscc.util.Log.warn(("Close " + (serialPort.getName())));
    if ((serialPort) != null) {
        serialPort.removeEventListener();
        serialPort.close();
    }
    if ((input) != null) {
        input.close();
        input = null;
    }
    if ((edu.ncku.uscc.io.DehumidRoomController.output) != null) {
        edu.ncku.uscc.io.DehumidRoomController.output.close();
        edu.ncku.uscc.io.DehumidRoomController.output = null;
    }
}