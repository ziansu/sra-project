private void passOnlinePeople() {
    java.lang.String totalPeople = "";
    for (java.lang.String str : userlist.values()) {
        totalPeople = (totalPeople + str) + ". ";
    }
    for (java.net.Socket s : userlist.keySet()) {
        java.io.PrintWriter wordout = this.outToSocket(s);
        if (wordout == null)
            continue;
        
        wordout.println(("/onlineList/" + totalPeople));
    }
}