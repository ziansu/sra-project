private void updateComponentSchema() {
    org.talend.core.runtime.services.IGenericWizardService wizardService = null;
    if (org.talend.core.GlobalServiceRegister.getDefault().isServiceRegistered(org.talend.core.runtime.services.IGenericWizardService.class)) {
        wizardService = ((org.talend.core.runtime.services.IGenericWizardService) (org.talend.core.GlobalServiceRegister.getDefault().getService(org.talend.core.runtime.services.IGenericWizardService.class)));
    }
    if ((wizardService != null) && ((schemaParam) != null)) {
        wizardService.updateComponentSchema(node.getComponentProperties(), schemaParam.getName(), currentOutputMetadata, schemaParam);
    }
}