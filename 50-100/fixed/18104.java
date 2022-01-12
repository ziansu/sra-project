private boolean isTableActivatable(edu.berkeley.path.beats.control.Controller_HOT_Lookup.TableData td, edu.berkeley.path.beats.control.Clock clock) {
    return (((currentTableForVehtypes[td.vehTypeIn]) == null) && ((td.startTime) <= (clock.getT()))) && ((td.stopTime) > (clock.getT()));
}