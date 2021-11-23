public void display(java.util.List<udo.storage.Task> receivedList) {
    assert receivedList != null;
    processReceivedList(receivedList);
    udo.gui.GUI.controller.setData();
}