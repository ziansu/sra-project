@java.lang.Override
public void init(org.sensorhub.impl.sensor.avl.AVLConfig config) throws org.sensorhub.api.common.SensorHubException {
    super.init(config);
    this.foiIDs = new java.util.LinkedHashSet<java.lang.String>();
    this.vehicleFois = new java.util.LinkedHashMap<java.lang.String, net.opengis.gml.v32.AbstractFeature>();
    dataInterface = new org.sensorhub.impl.sensor.avl.AVLOutput(this);
    addOutput(dataInterface, false);
    dataInterface.init();
}