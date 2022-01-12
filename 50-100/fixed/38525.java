public boolean write(byte[] data) {
    com.example.ntd.tpapplication.RR2FPrtcl msg = new com.example.ntd.tpapplication.RR2FPrtcl();
    if ((TxQueue.size()) >= (com.example.ntd.tpapplication.RR2F.MAXIMUM_TX_QUEUE_LEN)) {
        return false;
    }
    if ((TxQueue.size()) == 0) {
        TxQueue.add(data);
        sendDataInQueue();
    }else {
        TxQueue.add(data);
    }
    return true;
}