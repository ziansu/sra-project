private void updateSchemaForwarding(org.motechproject.commcare.config.Config config, java.util.List<java.lang.String> endpoints) {
    if ((config.isForwardSchema()) && (!(endpoints.contains(org.motechproject.commcare.service.impl.CommcareConfigServiceImpl.FORWARD_SCHEMA_TYPE)))) {
        boolean result = forward(config, org.motechproject.commcare.service.impl.CommcareConfigServiceImpl.FORWARD_SCHEMA_TYPE, getSchemaChangeUrl(config.getName()));
        config.setForwardSchema(result);
    }else
        if ((!(config.isForwardSchema())) && (endpoints.contains(org.motechproject.commcare.service.impl.CommcareConfigServiceImpl.FORWARD_SCHEMA_TYPE))) {
            config.setForwardSchema(true);
        }
    
}