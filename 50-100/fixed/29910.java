public void switchHand(java.lang.String handID) throws java.io.IOException, java.lang.InterruptedException {
    if ((out) == null) {
        java.lang.System.out.println("Server is not running.");
        return ;
    }
    byte[] output = handID.getBytes();
    synchronized(out) {
        out.write(output);
        out.flush();
        while (!(cardRequestSent)) {
            out.wait();
        } 
        cardRequestSent = false;
    }
}