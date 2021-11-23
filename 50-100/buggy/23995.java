@org.springframework.web.bind.annotation.ModelAttribute
public org.egov.ptis.domain.entity.property.Property propertyModel(@org.springframework.web.bind.annotation.PathVariable
java.lang.String id) {
    property = taxExemptionService.findByNamedQuery(org.egov.ptis.web.controller.transactions.exemption.QUERY_WORKFLOW_PROPERTYIMPL_BYID, java.lang.Long.valueOf(id));
    if (null == (property)) {
        property = taxExemptionService.findByNamedQuery(org.egov.ptis.web.controller.transactions.exemption.QUERY_PROPERTYIMPL_BYID, java.lang.Long.valueOf(id));
    }
    return property;
}