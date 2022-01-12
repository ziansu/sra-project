private void outputAndUpdateMess(java.io.DataOutputStream out, java.lang.String whoClientOrServer) {
    try {
        java.lang.System.out.println(("outputAndUpdateMess " + (sendingMessage)));
        out.writeUTF(sendingMessage);
        java.lang.System.out.println(("After outputAndUpdateMess " + (sendingMessage)));
    } catch (java.lang.Exception e1) {
        e1.printStackTrace();
    }
}