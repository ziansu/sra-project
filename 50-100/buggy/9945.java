public boolean remove(net.osmand.osm.edit.Relation.RelationMember key) {
    if ((members) != null) {
        java.util.Iterator<net.osmand.osm.edit.Relation.RelationMember> it = members.iterator();
        while (it.hasNext()) {
            net.osmand.osm.edit.Relation.RelationMember rm = it.next();
            if (rm == key) {
                return true;
            }
        } 
    }
    return false;
}