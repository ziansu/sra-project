@java.lang.Override
public void init(final rst.domotic.unit.UnitConfigType.UnitConfig unitConfig) throws java.lang.InterruptedException, org.openbase.jul.exception.InitializationException {
    try {
        init = true;
        this.unitRemote = ((UR) (org.openbase.bco.dal.remote.unit.Units.getUnit(unitConfig, false)));
    } catch (final org.openbase.jul.exception.CouldNotPerformException ex) {
        throw new org.openbase.jul.exception.InitializationException(this, ex);
    }
}