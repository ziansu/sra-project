public void sendMessage(abec_app.Client_info client, java.lang.String msg) {
    java.lang.System.out.println("---------------------- sendMessage()");
    try {
        java.io.OutputStream out = client.getSocket().getOutputStream();
        java.io.DataOutputStream sortie = new java.io.DataOutputStream(out);
        if (!(msg.isEmpty()))
            sortie.writeUTF(((client.getPseudo()) + msg));
        
        java.lang.System.out.println(("Send :   " + msg));
    } catch (java.lang.Exception e) {
        e.printStackTrace(java.lang.System.out);
    }
}