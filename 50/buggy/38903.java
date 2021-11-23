private void checkError() {
    error = ((receivePacket.getData()[0]) == 0) && ((receivePacket.getData()[1]) == 5);
}