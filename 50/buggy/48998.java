public hu.bme.mit.inf.mqtt.common.data.Identity createIdentity() {
    hu.bme.mit.inf.mqtt.common.data.SectionArray sections = new hu.bme.mit.inf.mqtt.common.data.SectionArray(((hu.bme.mit.inf.mqtt.common.data.Section[]) (managedSections.toArray())));
    return new hu.bme.mit.inf.mqtt.common.data.Identity(managedTurnout, sections);
}