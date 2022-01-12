@javax.ws.rs.DELETE
public void deleteTemplateDefinitionList(@javax.ws.rs.PathParam(value = com.abiquo.api.resources.appslibrary.TemplateDefinitionListResource.TEMPLATE_DEFINITION_LIST)
final java.lang.Integer templateDefinitionListId) {
    service.removeTemplateDefinitionList(templateDefinitionListId, false);
}