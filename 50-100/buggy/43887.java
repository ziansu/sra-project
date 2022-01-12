public java.lang.String gomokuMain(char turn) throws java.io.IOException, java.net.UnknownHostException {
    java.lang.String status = "continuing";
    java.lang.System.out.println(("player: " + (player)));
    do {
        Move chosenMove = startSearch();
        makeMove(chosenMove);
        status = readServer();
        java.lang.System.out.println(status);
    } while (status.equals("continuing") );
    return status;
}