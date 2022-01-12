protected edu.umd.smile.object.ObjectBondTracker.ObjectBond findLoosenable(com.jme3.scene.Spatial guestItem, com.jme3.math.Vector3f clickedLocation) {
    com.jme3.scene.Node guest = getNearestGuestBondPoint(guestItem, clickedLocation);
    if (guest == null) {
        return null;
    }
    edu.umd.smile.object.ObjectBondTracker.ObjectBond bond = getBond(guest);
    if (!(lockedHosts.contains(bond.host))) {
        return bond;
    }else {
        return null;
    }
}