public void listGameSessions(org.json.simple.JSONObject json) {
    java.lang.String[] tmpArray = new java.lang.String[java.lang.Integer.parseInt(json.get("numOfGames").toString())];
    for (int i = 0; i < (tmpArray.length); i++) {
        tmpArray[i] = json.get(("server" + i)).toString();
    }
    com.ser215.rps.RPSClientApplication.log.printToLog("INFO", tmpArray.toString());
    gsList.refreshList(tmpArray);
}