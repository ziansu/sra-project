@java.lang.Override
protected void updateSensorDescription() {
    synchronized(sensorDescription) {
        super.updateSensorDescription();
        sensorDescription.setId("NEXRAD_SENSOR");
        sensorDescription.setUniqueIdentifier(org.sensorhub.impl.sensor.nexrad.NexradSensor.SITE_UID_PREFIX);
        sensorDescription.setDescription("Sensor supporting Level II Nexrad data");
        for (java.lang.String siteId : config.siteIds) {
            java.lang.String name = "site_" + siteId;
            java.lang.String href = ((org.sensorhub.impl.sensor.nexrad.NexradSensor.SITE_UID_PREFIX) + "_") + siteId;
            java.lang.System.err.println(("NexradSensorURL: " + href));
            ((net.opengis.sensorml.v20.PhysicalSystem) (sensorDescription)).getComponentList().add(name, href, null);
        }
    }
}