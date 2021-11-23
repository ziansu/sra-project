private void send_a1() throws java.io.IOException {
    if ((queue.size()) > 0) {
        com.sio.model.DefaultUDPAtomicData pack = queue.get(0);
        write(pack.getIp(), pack.getPort(), pack.getData());
        registration(com.sio.net.SELECTION_READ);
    }
}