public java.lang.String[] getTemplateTitles() {
    Services.ContractTemplateService contractTemplateService = new Services.ContractTemplateService();
    java.util.ArrayList<Models.ContractTemplate> templates = contractTemplateService.getAll();
    java.util.ArrayList<java.lang.String> templateTitles = new java.util.ArrayList<java.lang.String>();
    for (Models.ContractTemplate template : templates) {
        templateTitles.add(template.getTitle());
    }
    return templateTitles.toArray(new java.lang.String[0]);
}