public boolean handleVoiceMsg(int ID, socket.Message msg) {
    if (msg.getType().equals("Voice")) {
        java.lang.String userIP = findUserThread(msg.getSender()).socket.getInetAddress().getHostAddress();
        java.lang.System.out.println(("The IP address from using find user thread :" + userIP));
        sip.Vsjtalk talk = new sip.Vsjtalk(userIP);
        talk.startPhone();
        java.lang.System.out.println("phone started");
    }else {
    }
    return false;
}