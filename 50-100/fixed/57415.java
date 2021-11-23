@java.lang.Override
public void covNotificationReceived(final com.serotonin.bacnet4j.type.primitive.UnsignedInteger subscriberProcessIdentifier, final com.serotonin.bacnet4j.RemoteDevice initiatingDevice, final com.serotonin.bacnet4j.type.primitive.ObjectIdentifier monitoredObjectIdentifier, final com.serotonin.bacnet4j.type.primitive.UnsignedInteger timeRemaining, final com.serotonin.bacnet4j.type.constructed.SequenceOf<com.serotonin.bacnet4j.type.constructed.PropertyValue> listOfValues) {
    if ((((root.device) != null) && (root.device.equals(initiatingDevice))) && (point.oid.equals(monitoredObjectIdentifier))) {
        event.clear();
        event.add(listOfValues);
    }
}