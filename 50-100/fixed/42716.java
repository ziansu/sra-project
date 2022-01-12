public java.lang.String roadTo(java.lang.String target) {
    java.lang.String comid = decc.Communication.generateComid(target, this.name);
    for (decc.Peer p : this.pairs.values()) {
        decc.Communication com = new decc.Communication(comid, target, p);
        decc.packet.RoadPck rpck = new decc.packet.RoadPck(comid, this.name, target);
        p.sendRoute(rpck.getPck());
        this.coms.add(com);
    }
    return comid;
}