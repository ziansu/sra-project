@java.lang.Override
public void updateModelStateToView() {
    m2vSetRadius();
    m2vSetEfficiency();
    m2vSetAirDensity();
    m2vSetCostPerUnit();
    m2vSetLocation();
    m2vSetNumberOfPanels();
    m2vOutputPowerPerDollar();
    item.getTable().layout();
}