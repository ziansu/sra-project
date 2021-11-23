public c2f.boatbusters.interfaces.WarShipInterface getType(java.lang.String type) {
    if (type == null) {
        return null;
    }
    if (type.equalsIgnoreCase("SMALL")) {
        return new c2f.boatbusters.factories.WarShip(2);
    }else
        if (type.equalsIgnoreCase("MIDDLE")) {
            return new c2f.boatbusters.factories.WarShip(3);
        }else
            if (type.equalsIgnoreCase("BIG")) {
                return new c2f.boatbusters.factories.WarShip(4);
            }
        
    
    return null;
}