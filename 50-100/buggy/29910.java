public void switchHand(java.lang.String handID) throws java.io.IOException, java.lang.InterruptedException {
    if ((out) == null) {
        java.lang.System.out.println("Server is not running.");
        return ;
    }
    byte[] output = handID.getBytes();
    java.lang.System.out.println("Waiting for lock");
    synchronized(out) {
        java.lang.System.out.println("switchHand got lock");
        out.write(output);
        out.flush();
        while (!(cardRequestSent)) {
            out.wait();
        } 
        cardRequestSent = false;
    }
}