private void broadcast(java.lang.String msg) {
    for (java.net.Socket s : userlist.keySet()) {
        if (this.username.equals(userlist.get(s)))
            continue;
        
        java.io.PrintWriter wordout = this.outToSocket(s);
        wordout.println(msg);
    }
}