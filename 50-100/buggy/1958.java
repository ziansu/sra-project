@java.lang.Override
public void execute(final java.lang.Object message) throws java.lang.Exception {
    final org.mobicents.servlet.restcomm.mgcp.EndpointCredentials response = ((org.mobicents.servlet.restcomm.mgcp.EndpointCredentials) (message));
    masterIVREndpointId = response.endpointId();
    masterIVREndpointIdName = masterIVREndpointId.getLocalEndpointName();
    logger.info((("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ masterIVREndpointId:" + (masterIVREndpointIdName)) + " ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"));
    updateMasterIVREndpointId();
}