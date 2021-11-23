public void display(java.util.List<udo.storage.Task> receivedList) {
    assert receivedList != null;
    java.lang.System.out.println(("In GUI: received list is " + receivedList));
    processReceivedList(receivedList);
    udo.gui.GUI.controller.setData();
}