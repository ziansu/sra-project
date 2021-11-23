private boolean getPlayerPassword(java.io.PrintWriter msgOut, java.io.BufferedReader msgIn, Player newPlayer) {
    java.lang.String tempPassword = "";
    msgOut.print("Please input your Password: ");
    msgOut.flush();
    try {
        tempPassword = msgIn.readLine();
    } catch (java.io.IOException e) {
        java.lang.System.out.println(("IOException in getPlayerPassword: " + (e.getMessage())));
    }
    newPlayer.setPassword(tempPassword);
    return true;
}