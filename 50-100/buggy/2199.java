@java.lang.Override
public void init(final rst.domotic.unit.UnitConfigType.UnitConfig unitConfig) throws java.lang.InterruptedException, org.openbase.jul.exception.InitializationException {
    try {
        init = true;
        java.lang.System.out.println(("INIT: " + (unitConfig.getLabel())));
        this.unitRemote = ((UR) (org.openbase.bco.dal.remote.unit.Units.getUnit(unitConfig, false)));
        java.lang.System.out.println(("++++++ UnitRemote : " + (unitRemote)));
    } catch (final org.openbase.jul.exception.CouldNotPerformException ex) {
        throw new org.openbase.jul.exception.InitializationException(this, ex);
    }
}