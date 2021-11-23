@java.lang.Override
public void setDataAttributeValues(java.util.Map<java.lang.Integer, java.lang.String> values) {
    for (java.lang.Integer i : values.keySet()) {
        de.uni_potsdam.hpi.bpt.bp2014.jcore.DataAttributeInstance dataAttributeInstance = scenarioInstance.getDataAttributeInstances().get(i);
        dataAttributeInstance.setValue(i, values.get(i));
    }
    this.setCanTerminate(true);
}