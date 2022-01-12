public static org.wso2.carbon.apimgt.rest.api.utils.mappings.Documentation fromDTOtoDocumentation(org.wso2.carbon.apimgt.rest.api.dto.DocumentDTO dto) {
    org.wso2.carbon.apimgt.rest.api.utils.mappings.Documentation doc = new org.wso2.carbon.apimgt.rest.api.utils.mappings.Documentation(org.wso2.carbon.apimgt.rest.api.utils.mappings.DocumentationType.valueOf(dto.getType().toString()), dto.getName());
    doc.setSummary(dto.getSummary());
    java.lang.String visibility = dto.getVisibility().toString();
    if (visibility == null) {
        visibility = org.wso2.carbon.apimgt.impl.APIConstants.DOC_API_BASED_VISIBILITY;
    }
    doc.setVisibility(Documentation.DocumentVisibility.valueOf(visibility));
    doc.setSourceType(Documentation.DocumentSourceType.INLINE);
    return doc;
}