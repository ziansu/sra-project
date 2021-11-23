public static void main(java.lang.String[] args) {
    FileTransferClient c = new FileTransferClient();
    while (true) {
        c.promtUser();
        c.sendAndReceive();
    } 
}