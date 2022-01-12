public boolean setUnit(int index, kingofthehill.domain.Unit unit) {
    if ((getUnit(index)) != null) {
        return false;
    }
    try {
        this.units[index] = unit;
        unit.setBase(this);
        return true;
    } catch (java.lang.Exception ex) {
        return false;
    }
}