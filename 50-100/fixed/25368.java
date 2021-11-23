@java.lang.Override
public void run() {
    while (true) {
        try {
            byte[] head = new byte[header.headerLength()];
            in.read(head);
            byte[] msg = new byte[header.payloadLength(head)];
            in.read(head);
            receiver.receive(new com.shuffle.p2p.Bytestring(msg));
        } catch (java.io.IOException e) {
            session.close();
            return ;
        }
    } 
}