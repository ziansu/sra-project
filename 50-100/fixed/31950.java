public static atlantis.units.Select<atlantis.units.AUnit> our() {
    java.util.List<atlantis.units.AUnit> data = new java.util.ArrayList<>();
    for (atlantis.units.AUnit unit : atlantis.units.Select.ourUnits()) {
        if (((unit.exists()) && (unit.isCompleted())) && (!(unit.isType(AUnitType.Terran_Vulture_Spider_Mine, AUnitType.Zerg_Larva, AUnitType.Zerg_Egg)))) {
            data.add(unit);
        }
    }
    return new atlantis.units.Select<atlantis.units.AUnit>(data);
}