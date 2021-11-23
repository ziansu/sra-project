public static void recvSeq(zmq.SocketBase socket, java.lang.String... data) {
    java.lang.String rc;
    for (int idx = 0; idx < (data.length); ++idx) {
        rc = zmq.Helper.recv(socket);
        assert data[idx].equals(rc);
    }
}