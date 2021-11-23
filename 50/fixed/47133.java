public boolean isType(atlantis.units.AUnitType... types) {
    for (atlantis.units.AUnitType otherType : types) {
        if (this.equals(otherType)) {
            return true;
        }
    }
    return false;
}