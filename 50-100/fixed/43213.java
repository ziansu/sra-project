protected void cleanUnit(nationGen.units.Unit u) {
    nationGen.items.Item weapon = u.getSlot("weapon");
    boolean twohand = nationGen.weapondb.GetValue(weapon.id, "2h").equals("1");
    if (twohand && (!(this.isDualWieldEligible(u))))
        u.setSlot("offhand", null);
    
}