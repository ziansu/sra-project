public com.ma.schiffeversenken.android.model.Field.ShipsDescriptor newShipsDescriptor(com.ma.schiffeversenken.android.model.Ship[] placedShips) {
    com.ma.schiffeversenken.android.model.Field.ShipsDescriptor desc = new com.ma.schiffeversenken.android.model.Field.ShipsDescriptor();
    desc.shipsPlaced = new java.util.ArrayList<com.ma.schiffeversenken.android.model.Field.ShipDescriptor>(placedShips.length);
    for (com.ma.schiffeversenken.android.model.Ship ship : placedShips) {
        com.ma.schiffeversenken.android.model.Field.ShipDescriptor shipDesc = new com.ma.schiffeversenken.android.model.Field.ShipDescriptor().newShipDescriptor(ship);
        desc.shipsPlaced.add(shipDesc);
    }
    return desc;
}