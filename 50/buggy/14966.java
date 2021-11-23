private boolean verifiyStratumNonZeroMass(planet.surface.Stratum stratum, boolean workOnTop) {
    if ((stratum.getMass()) <= 0) {
        if (workOnTop) {
            removeTopStratum();
        }else {
            removeBottomStratum();
        }
        return false;
    }
    return true;
}