@java.lang.Override
@org.springframework.jmx.export.annotation.ManagedOperation
public void replaceChannelMappings(java.util.Properties channelMappings) {
    super.replaceChannelMappings(channelMappings);
    populateClassNameMapping(getChannelMappings().keySet());
}