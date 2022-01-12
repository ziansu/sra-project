public boolean hasRangeToAttack(atlantis.units.AUnit targetUnit, double safetyMargin) {
    bwapi.WeaponType weaponAgainstThisUnit = getWeaponAgainst(targetUnit);
    if (weaponAgainstThisUnit == (bwapi.WeaponType.None)) {
        return false;
    }
    double dist = this.distanceTo(targetUnit);
    return (dist <= (((weaponAgainstThisUnit.maxRange()) / 32) + safetyMargin)) && (dist >= ((weaponAgainstThisUnit.minRange()) / 32));
}