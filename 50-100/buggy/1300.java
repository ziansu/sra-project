public static boolean IsConnected(mck.MatlabEngine eng, java.lang.String printOption) throws java.lang.Exception {
    boolean bIsConnected;
    double con = eng.getVariable("Client.IsConnected");
    if (con == 1.0) {
        bIsConnected = true;
        if (printOption == "p") {
            java.lang.System.out.println("CONNECTED");
        }
    }else {
        bIsConnected = false;
        if (printOption == "p") {
            java.lang.System.out.println("NOT CONNECTED");
        }
    }
    return bIsConnected;
}