public void saveWithParameters(org.openlmis.reporting.model.Template template) {
    templateRepository.save(template);
    for (org.openlmis.reporting.model.TemplateParameter parameter : template.getTemplateParameters()) {
        parameter.setTemplate(template);
        parameter = templateParameterRepository.save(parameter);
    }
}