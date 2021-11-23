public void setUnit(unitCalc.Unit unit) {
    this.value = this.value.multiply(unit.baseRelation);
    this.unit = unit.measure.baseUnit;
    this.measure = unit.measure;
    this.siBase = new int[7];
    java.lang.System.arraycopy(unit.measure.siBase, 0, this.siBase, 0, 7);
    if (this.isConstant) {
        this.id = "var";
        this.name = null;
    }
}