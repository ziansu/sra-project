@java.lang.Override
public void setUnit(java.lang.String unit) throws me.legrange.panstamp.NoSuchUnitException {
    unit = (unit != null) ? unit.trim() : "";
    this.unit = (!(unit.isEmpty())) ? getUnit(unit) : null;
}