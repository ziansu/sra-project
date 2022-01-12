private static org.mule.config.ConfigResource createConfigResource(final com.eucalyptus.component.ComponentId componentId, final java.lang.String outString) {
    final java.io.ByteArrayInputStream bis = new java.io.ByteArrayInputStream(outString.getBytes());
    com.eucalyptus.records.Logs.extreme().trace("===================================");
    com.eucalyptus.records.Logs.extreme().trace(outString);
    com.eucalyptus.records.Logs.extreme().trace("===================================");
    final org.mule.config.ConfigResource configRsc = new org.mule.config.ConfigResource(componentId.getServiceModelFileName(), bis);
    return configRsc;
}