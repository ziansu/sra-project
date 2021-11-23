@java.lang.Override
public java.util.List<java.lang.String> getGenericTypeNames() {
    java.util.List<java.lang.String> typeNames = new java.util.ArrayList<>();
    java.util.Set<org.talend.components.api.wizard.ComponentWizardDefinition> wizardDefinitions = internalService.getComponentService().getTopLevelComponentWizards();
    for (org.talend.components.api.wizard.ComponentWizardDefinition wizardDefinition : wizardDefinitions) {
        typeNames.add(wizardDefinition.getName());
    }
    return typeNames;
}