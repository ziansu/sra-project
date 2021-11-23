@java.lang.Override
public void run() {
    while (true) {
        try {
            byte[] head = new byte[header.headerLength()];
            int bytesRead = in.read(head);
            if (bytesRead < (head.length)) {
                break;
            }
            receiver.receive(new com.shuffle.p2p.Bytestring(new byte[header.payloadLength(head)]));
        } catch (java.io.IOException e) {
            break;
        }
    } 
    session.close();
    return ;
}