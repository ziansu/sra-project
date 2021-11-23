public void goBackward() {
    stopMoving();
    curr_packet.power = 100;
    curr_packet.angle = ((byte) (180));
}