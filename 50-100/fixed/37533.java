public void sellProperty(edu.ncsu.monopoly.Cell property, int amount) {
    property.setOwner(null);
    try {
        if (property instanceof edu.ncsu.monopoly.PropertyCell) {
            properties.remove(property);
        }
        if (property instanceof edu.ncsu.monopoly.RailRoadCell) {
            railroads.remove(property);
        }
        if (property instanceof edu.ncsu.monopoly.UtilityCell) {
            railroads.remove(property);
        }
    } catch (java.lang.Exception e) {
    }
    setMoney(((getMoney()) + amount));
}