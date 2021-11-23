public void load(megamek.common.Entity unit) throws java.lang.IllegalArgumentException {
    if (!(canLoad(unit))) {
        throw new java.lang.IllegalArgumentException((("Can not load " + (unit.getShortName())) + " into this troop space."));
    }
    currentSpace -= unit.getWeight();
    troops.put(unit.getId(), unit.getWeight());
}