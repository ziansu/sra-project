public void run() {
    try {
        mediator.fireEvent(new edu.rosehulman.p2p.impl.find.FindAction(fileName, (depth - 1), ""));
        statusPanel.postStatus((((("Getting file " + fileName) + " from ") + fileName) + "..."));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        statusPanel.postStatus((("Error sending the get file request to " + fileName) + "! "));
    }
}