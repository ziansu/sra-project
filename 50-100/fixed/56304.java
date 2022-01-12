@java.lang.Override
protected void addParameterDefinitions(java.util.List<org.alfresco.service.cmr.action.ParameterDefinition> paramList) {
    paramList.add(new org.alfresco.repo.action.ParameterDefinitionImpl(org.alfresco.extension.pdftoolkit.constants.PDFToolkitConstants.PARAM_DESTINATION_FOLDER, org.alfresco.service.cmr.dictionary.DataTypeDefinition.NODE_REF, true, getParamDisplayLabel(PDFToolkitConstants.PARAM_DESTINATION_FOLDER)));
    paramList.add(new org.alfresco.repo.action.ParameterDefinitionImpl(org.alfresco.extension.pdftoolkit.constants.PDFToolkitConstants.PARAM_EXTRACT_PAGES, org.alfresco.service.cmr.dictionary.DataTypeDefinition.TEXT, true, getParamDisplayLabel(PDFToolkitConstants.PARAM_DELETE_PAGES)));
    paramList.add(new org.alfresco.repo.action.ParameterDefinitionImpl(org.alfresco.extension.pdftoolkit.constants.PDFToolkitConstants.PARAM_DESTINATION_NAME, org.alfresco.service.cmr.dictionary.DataTypeDefinition.TEXT, true, getParamDisplayLabel(PDFToolkitConstants.PARAM_DESTINATION_NAME)));
    super.addParameterDefinitions(paramList);
}