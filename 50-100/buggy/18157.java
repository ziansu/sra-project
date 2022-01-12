private boolean object_in_range(no.polaric.aprsd.Channel.Packet p, int range) {
    if (((_api.getOwnPos()) == null) && ((_api.getOwnPos().getPosition()) == null))
        return true;
    
    no.polaric.aprsd.AprsPoint obj = _api.getDB().getItem(p.msgto, null);
    if (obj == null)
        return false;
    
    return (obj.distance(_api.getOwnPos())) < (range * 1000);
}