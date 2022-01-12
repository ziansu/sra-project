static void split() {
    if ((com.mraof.minestuck.MinestuckConfig.globalSession) || ((com.mraof.minestuck.network.skaianet.SessionHandler.sessions.size()) != 1))
        return ;
    
    com.mraof.minestuck.network.skaianet.Session s = com.mraof.minestuck.network.skaianet.SessionHandler.sessions.get(0);
    com.mraof.minestuck.network.skaianet.SessionHandler.split(s);
}