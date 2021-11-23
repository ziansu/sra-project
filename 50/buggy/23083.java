public void ack() {
    (acks)++;
    if ((acks) >= ((inst.numNodes) - 1)) {
        waiting = false;
        update();
    }
}