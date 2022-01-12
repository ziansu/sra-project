@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((this) == obj) {
        return true;
    }
    if (obj == null) {
        return false;
    }
    if (obj instanceof atlantis.units.AUnitType) {
        atlantis.units.AUnitType other = ((atlantis.units.AUnitType) (obj));
        return ut.toString().equals(other.ut.toString());
    }
    return false;
}