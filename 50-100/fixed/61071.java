public org.chernovia.net.games.parlour.acro.server.AcroPlayer addNewPlayer(org.chernovia.lib.netgames.zugserv.Connection conn) {
    if ((players.size()) > (maxplay)) {
        conn.tell(ZugServ.MSG_SERV, "Game Full!?");
        return null;
    }else {
        org.chernovia.net.games.parlour.acro.server.AcroPlayer p = new org.chernovia.net.games.parlour.acro.server.AcroPlayer(this, conn);
        players.add(p);
        conn.tell(ZugServ.MSG_SERV, "Welcome!");
        if ((box) != null)
            box.updateScores(players);
        
        return p;
    }
}