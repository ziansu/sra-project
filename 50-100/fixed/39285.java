@java.lang.Override
public void update(org.modelio.metamodel.uml.infrastructure.ModelElement element, org.modelio.api.module.propertiesPage.IModulePropertyTable table) {
    java.lang.String property = edu.casetools.rcase.utils.PropertiesUtils.getInstance().getTaggedValue(RCaseProperties.PROPERTY_REQUIREMENT_ID, element);
    table.addProperty(edu.casetools.rcase.module.i18n.I18nMessageService.getString("Ui.Requirement.Property.TagId"), property);
    table.addProperty(RCaseProperties.PROPERTY_NAME, element.getName());
    property = edu.casetools.rcase.utils.PropertiesUtils.getInstance().getTaggedValue(RCaseProperties.PROPERTY_REQUIREMENT_DESCRIPTION, element);
    table.addProperty(edu.casetools.rcase.module.i18n.I18nMessageService.getString("Ui.Requirement.Property.TagText"), property);
    checkDependencies(element, table);
}