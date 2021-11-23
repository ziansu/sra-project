@java.lang.SuppressWarnings(value = "unchecked")
private void appendComponentNetworkProperties(com.artemis.Component component, com.artemis.utils.Bag<net.mostlyoriginal.api.io.network.common.NetworkedProperty> properties) {
    byte fieldIndex = net.mostlyoriginal.api.io.network.common.SnapshotEncoder.INDEX_FIRST_PROPERTY;
    final java.lang.Object[] data = properties.getData();
    for (int i = 0, s = properties.size(); i < s; i++) {
        final net.mostlyoriginal.api.io.network.common.NetworkedProperty property = ((net.mostlyoriginal.api.io.network.common.NetworkedProperty) (data[i]));
        byteBuffer.put(fieldIndex);
        property.encode(byteBuffer, component);
        fieldIndex++;
    }
}