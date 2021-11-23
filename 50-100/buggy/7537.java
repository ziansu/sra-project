private void gotLSAUpdateMsg(socs.network.message.Packet packet) {
    java.lang.System.out.println(("received LSUPDATE from " + (packet.simulatedSrcIP)));
    socs.network.node.LinkStateDatabase db = this.linkStateDatabase;
    for (socs.network.message.LSA lsa : packet.lsaArray) {
        try {
            boolean newLSA = db.updateLSA(lsa);
            if (!newLSA) {
                continue;
            }else {
                socs.network.node.Link linkOverWhichWeReceivedLSA = mapIpLink.get(packet.simulatedSrcIP);
                forwardToNeighbors(linkOverWhichWeReceivedLSA, lsa);
            }
        } catch (java.lang.Exception e) {
            java.lang.System.err.println("could not update LinkStateDatabase");
            e.printStackTrace();
        }
    }
}