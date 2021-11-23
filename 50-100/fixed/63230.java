public static void setVariable(java.lang.String name, eu.esdihumboldt.hale.common.core.io.Value value, eu.esdihumboldt.hale.common.core.io.project.ComplexConfigurationService projectConfiguration) {
    eu.esdihumboldt.hale.common.core.io.Value variables = projectConfiguration.getProperty(eu.esdihumboldt.hale.common.core.io.project.ProjectVariables.PROJECT_PROPERTY_VARIABLES);
    eu.esdihumboldt.hale.common.core.io.ValueProperties properties = variables.as(eu.esdihumboldt.hale.common.core.io.ValueProperties.class);
    if (properties == null) {
        properties = new eu.esdihumboldt.hale.common.core.io.ValueProperties();
    }else {
        if ((variables.getValue()) != null) {
            eu.esdihumboldt.hale.common.core.io.project.ProjectVariables.log.error("Unknown representation of project variables");
        }
    }
    properties.put(name, value);
    projectConfiguration.setProperty(eu.esdihumboldt.hale.common.core.io.project.ProjectVariables.PROJECT_PROPERTY_VARIABLES, eu.esdihumboldt.hale.common.core.io.Value.complex(properties));
}