@java.lang.Override
public void saveState(org.sensorhub.api.module.IModuleStateManager saver) throws org.sensorhub.api.common.SensorHubException {
    try {
        java.io.OutputStream os = saver.getOutputStream(org.sensorhub.impl.sensor.swe.SWETransactionalSensor.STATE_SML_DESC);
        new org.vast.sensorML.SMLUtils(org.vast.sensorML.SMLUtils.V2_0).writeProcess(os, sensorDescription, true);
    } catch (java.lang.Exception e) {
        throw new org.sensorhub.api.common.SensorHubException(("Error while saving state for module " + (org.sensorhub.utils.MsgUtils.moduleString(this))), e);
    }
}