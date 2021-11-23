public org.wisdom.template.thymeleaf.impl.ThymeLeafTemplateImplementation addTemplate(org.osgi.framework.Bundle bundle, java.net.URL templateURL) {
    org.wisdom.template.thymeleaf.impl.ThymeLeafTemplateImplementation template = getTemplateByURL(templateURL);
    if (template != null) {
        return template;
    }
    template = new org.wisdom.template.thymeleaf.impl.ThymeLeafTemplateImplementation(engine, templateURL, router, assets, bundle);
    org.osgi.framework.ServiceRegistration<org.wisdom.api.templates.Template> reg = context.registerService(org.wisdom.api.templates.Template.class, template, template.getServiceProperties());
    registrations.put(template, reg);
    org.wisdom.template.thymeleaf.ThymeleafTemplateCollector.LOGGER.info("Thymeleaf template added for {}", templateURL.toExternalForm());
    return template;
}