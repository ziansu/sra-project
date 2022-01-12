public io.symcpe.wraith.actions.alerts.templated.AlertTemplate getTemplateObj(javax.persistence.EntityManager em, java.lang.String tenantId, short templateId) throws java.lang.Exception {
    io.symcpe.hendrix.api.storage.AlertTemplates template = getTemplate(em, tenantId, templateId);
    if ((template.getTemplateContent()) != null) {
        return io.symcpe.wraith.actions.alerts.templated.AlertTemplateSerializer.deserialize(template.getTemplateContent());
    }else {
        return new io.symcpe.wraith.actions.alerts.templated.AlertTemplate(templateId, "", "", "", "", "");
    }
}