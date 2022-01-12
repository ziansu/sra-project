private void outputAndUpdateMess(java.io.DataOutputStream out, java.lang.String whoClientOrServer) {
    try {
        java.lang.System.out.println(("outputAndUpdateMess " + (sendingMessage)));
        java.lang.String message = java.lang.String.format(sendingMessage);
        out.writeUTF(message);
        java.lang.System.out.println(("After outputAndUpdateMess " + message));
    } catch (java.lang.Exception e1) {
        e1.printStackTrace();
    }
}