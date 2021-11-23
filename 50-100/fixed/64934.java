public static c2f.boatbusters.interfaces.WarShipInterface getType(int type) {
    if (type == 1) {
        return new c2f.boatbusters.factories.WarShip(2);
    }else
        if (type == 2) {
            return new c2f.boatbusters.factories.WarShip(3);
        }else
            if (type == 3) {
                return new c2f.boatbusters.factories.WarShip(4);
            }else {
                return null;
            }
        
    
}