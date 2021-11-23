private void updateSchemaForwarding(org.motechproject.commcare.config.Config config, java.util.List<java.lang.String> endpoints) {
    if ((config.isForwardSchema()) && (!(endpoints.contains(org.motechproject.commcare.service.impl.CommcareConfigServiceImpl.FORWARD_SCHEMA_TYPE)))) {
        forward(config, org.motechproject.commcare.service.impl.CommcareConfigServiceImpl.FORWARD_SCHEMA_TYPE, getSchemaChangeUrl(config.getName()));
    }else
        if ((!(config.isForwardSchema())) && (endpoints.contains(org.motechproject.commcare.service.impl.CommcareConfigServiceImpl.FORWARD_SCHEMA_TYPE))) {
            config.setForwardSchema(true);
        }
    
}