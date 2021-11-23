public boolean setUnit(int index, kingofthehill.domain.Unit unit) {
    if ((getUnit(index)) != null) {
        return false;
    }
    try {
        if (unit != null) {
            this.units[index] = unit;
            unit.setBase(this);
            return true;
        }else {
            return false;
        }
    } catch (java.lang.Exception ex) {
        return false;
    }
}