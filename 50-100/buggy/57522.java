public stellarclicker.ship.ShipComponent[] getInactiveComponents(stellarclicker.util.ESeniorStaff officer) {
    for (stellarclicker.util.EShipComponent m : stellarclicker.util.EShipComponent.values()) {
        if (!(shipComponents[m.ordinal()].isEnabled)) {
            inactiveComponents[m.ordinal()] = shipComponents[m.ordinal()];
        }else
            inactiveComponents[m.ordinal()] = null;
        
    }
    return inactiveComponents;
}