public void setTurnImminent(int turnImminent, boolean deviatedFromRoute) {
    if (((turnDrawable.turnImminent) != turnImminent) || ((turnDrawable.deviatedFromRoute) != deviatedFromRoute)) {
        turnDrawable.setTurnImminent(turnImminent, deviatedFromRoute);
        updateDistance();
    }
}