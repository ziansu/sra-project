public static void main(java.lang.String[] args) {
    while (true) {
        FileTransferClient c = new FileTransferClient();
        c.promtUser();
        c.sendAndReceive();
    } 
}