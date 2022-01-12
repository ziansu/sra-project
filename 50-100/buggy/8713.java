public void run() {
    java.lang.System.out.println("The Request has been received");
    java.lang.System.out.println(rawMsg);
    fields = rawMsg.split(GlobalVariables.token);
    if ((fields.length) == 1) {
        try {
            throw new java.lang.Exception("Bad Input, no delimiter identified");
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
    try {
        processRequest();
    } catch (global.HasRegisteredException | java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}