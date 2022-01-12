protected void sendAcceptFrom3(java.util.List<java.lang.String> aSortedList, InMessageType message) {
    java.lang.String aLastElement = aSortedList.remove(((aSortedList.size()) - 1));
    destination.send(aSortedList, message);
    destination.send(aLastElement, message);
}