private void passOnlinePeople() {
    java.lang.String totalPeople = "";
    for (java.lang.String str : userlist.values()) {
        totalPeople = (totalPeople + str) + ". ";
    }
    for (java.net.Socket s : userlist.keySet()) {
        java.io.PrintWriter wordout = this.outToSocket(s);
        wordout.println(("/onlineList/" + totalPeople));
    }
}