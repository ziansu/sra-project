public mcp.Game[] getGames() {
    int num = numGames();
    mcp.Game[] games = new mcp.Game[num];
    out.println(mcp.McpProxy.GET_GAMES);
    java.lang.String line = "";
    try {
        for (int i = 0; i < num; i++) {
            line = in.readLine();
            games[i] = mcp.Game.fromString(parent, line);
            i++;
        }
    } catch (java.io.IOException e) {
        java.lang.System.err.println("There was a problem communicating with the MCP.");
    }
    return games;
}