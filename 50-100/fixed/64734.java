@java.lang.Override
public java.util.List<java.lang.String> getGenericTypeNames() {
    if (typeNames.isEmpty()) {
        java.util.Set<org.talend.components.api.wizard.ComponentWizardDefinition> wizardDefinitions = internalService.getComponentService().getTopLevelComponentWizards();
        for (org.talend.components.api.wizard.ComponentWizardDefinition wizardDefinition : wizardDefinitions) {
            typeNames.add(wizardDefinition.getName());
        }
    }
    return typeNames;
}