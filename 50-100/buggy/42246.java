@java.lang.Override
public java.lang.String modifyMessageCorba(int msgID, java.lang.String inhalt) {
    if ((tafelServer) != null) {
        java.lang.String answer = "";
        try {
            tafelServer.modifyMessageCorba(msgID, inhalt);
            answer = "Done";
        } catch (verteilteAnzeigetafel.TafelException e) {
            answer = e.getMessage();
        }
        tafelServer.print(("modifyMessageCorba " + answer));
        return answer;
    }
    return null;
}