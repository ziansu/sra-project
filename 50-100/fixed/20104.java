@java.lang.Override
public Client.State getStatus() throws java.io.IOException {
    outToServer.writeBytes(("STATUS" + "\n"));
    java.lang.String response = inFromServer.readLine();
    java.lang.System.out.println(response);
    if (response.equals("DEFEAT")) {
        return State.DEFEAT;
    }
    if (response.equals("PLAY")) {
        return State.PLAY;
    }
    if (response.equals("WAIT")) {
        return State.WAIT;
    }
    if (response.equals("WIN")) {
        return State.WIN;
    }
    return null;
}