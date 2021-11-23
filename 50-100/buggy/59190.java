private com.GGI.uParty.Network.PList clearOldParties(com.GGI.uParty.Network.PList p) {
    java.util.Date d = new java.util.Date();
    for (int i = 0; i < (p.parties.size()); i++) {
        if ((d.getDate()) != (p.parties.get(i).d.getDate())) {
            p.parties.remove(i);
        }
    }
    return p;
}