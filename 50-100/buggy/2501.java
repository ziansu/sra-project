void setAutomaticBaseUnit(boolean setAutomaticBaseCoversionPolyCoeffs) {
    if ((unitManagerRef) != null) {
        com.example.unitconverter.Unit retrievedBaseUnit = unitManagerRef.getBaseUnit(this);
        if ((!(this.getBaseUnit().equals(retrievedBaseUnit))) && (!(retrievedBaseUnit.getUnitName().equalsIgnoreCase(com.example.unitconverter.Unit.UNKNOWN_UNIT_NAME)))) {
            if (this.baseUnit.getBaseUnit().equals(retrievedBaseUnit)) {
                setBaseUnit(this.baseUnit, setAutomaticBaseCoversionPolyCoeffs);
            }else {
                setBaseUnit(retrievedBaseUnit, setAutomaticBaseCoversionPolyCoeffs);
            }
        }
    }
}