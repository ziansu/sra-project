public synchronized void userList() {
    java.lang.String onlineMsg = "USERS#";
    for (java.lang.String user : EchoServer.users.keySet()) {
        onlineMsg += user + ",";
    }
    onlineMsg = onlineMsg.substring(0, ((onlineMsg.length()) - 1));
    java.lang.System.out.println(("Her er den fulde liste: " + onlineMsg));
    for (echoserver.EchoClientHandler ch : EchoServer.users.values()) {
        ch.sendUserList(onlineMsg);
    }
}