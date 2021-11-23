private java.util.List<no.styrkeproven.htmlmail.content.InputTypeDef> getInputTypeDefs() {
    java.util.List<no.styrkeproven.htmlmail.content.InputTypeDef> inputTypeDefs = com.google.common.collect.Lists.newArrayList();
    final com.enonic.cms.api.client.model.GetContentTypeConfigXMLParams getContentParams = new com.enonic.cms.api.client.model.GetContentTypeConfigXMLParams();
    getContentParams.name = no.styrkeproven.htmlmail.content.CreateContentParamsFactory.CONTENT_TYPE_NAME;
    final org.jdom.Document contentTypeConfigXML = client.getContentTypeConfigXML(getContentParams);
    no.styrkeproven.htmlmail.content.ContentTypeParser.parseInputTypeElements(inputTypeDefs, contentTypeConfigXML.getRootElement());
    java.lang.System.out.println(("InputTypeDefs: " + (inputTypeDefs.size())));
    return inputTypeDefs;
}