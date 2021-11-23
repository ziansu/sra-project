public client.serverproxy.GamesList getGamesList() {
    java.lang.String Jsonoutput = clientComm.send("games/list", "");
    Jsonoutput = ("{\"games\":" + Jsonoutput) + "}";
    java.lang.System.out.println(Jsonoutput);
    client.serverproxy.GamesList result = g.fromJson(Jsonoutput, client.serverproxy.GamesList.class);
    return result;
}