public java.lang.String formToSource(org.eclipse.ui.forms.editor.FormPage formPage, org.wso2.developerstudio.eclipse.gmf.esb.ArtifactType artifactType) throws java.lang.Exception {
    org.apache.synapse.config.xml.SynapseXMLConfigurationSerializer serializer = new org.apache.synapse.config.xml.SynapseXMLConfigurationSerializer();
    org.apache.synapse.config.xml.SequenceMediatorSerializer sequenceSerializer = new org.apache.synapse.config.xml.SequenceMediatorSerializer();
    org.apache.axiom.om.OMElement configOM = null;
    if (artifactType == (org.wso2.developerstudio.eclipse.gmf.esb.ArtifactType.LOCAL_ENTRY)) {
        configOM = org.apache.synapse.config.xml.EntrySerializer.serializeEntry(transformLocalEntry(formPage), null);
    }
    org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence.DefaultEsbModelExporter.sourceXML = format(configOM.toString());
    org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence.DefaultEsbModelExporter.sourceXML = org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence.DefaultEsbModelExporter.sourceXML.replaceAll("\\?><", "?>\n<");
    return org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence.DefaultEsbModelExporter.sourceXML;
}