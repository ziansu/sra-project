public void sendMessage(java.lang.String message) {
    try {
        if (((out) != null) && (!(out.checkError()))) {
            java.lang.System.out.println(("in sendMessage" + message));
            out.println(message);
            out.flush();
            java.lang.String response = in.readLine();
            java.lang.System.out.println(("fuckeroni: " + response));
        }
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("disconnected");
    }
}