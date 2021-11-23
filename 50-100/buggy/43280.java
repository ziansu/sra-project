@java.lang.Override
public java.lang.String encodeAsString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    builder.append(creationTime);
    builder.append(com.emc.storageos.coordinator.client.model.SiteError.ENCODING_SEPARATOR);
    if ((serviceCode) != null) {
        builder.append(serviceCode.toString());
        builder.append(com.emc.storageos.coordinator.client.model.SiteError.ENCODING_SEPARATOR);
        builder.append(errorMessage);
        builder.append(operation);
    }
    return builder.toString();
}