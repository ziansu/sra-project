public void run() {
    if ((packetType) == 1) {
        try {
            print("calling read handler");
            handleReadReq();
        } catch (java.io.IOException e) {
            error("IOException on read request");
        }
    }else
        if ((packetType) == 2) {
            try {
                print(("p2 " + (packet.getData().toString())));
                handleWriteReq(packet);
            } catch (java.io.IOException e) {
                error("IOException on write request");
            }
        }
    
}