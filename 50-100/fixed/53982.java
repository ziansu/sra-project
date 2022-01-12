private void requestBodySubTypeFieldAjaxUpdate(org.apache.wicket.ajax.AjaxRequestTarget target) {
    this.requestBodyMapJsonField.setRequired(false);
    if (TypeEnum.Map.getLiteral().equals(this.requestBodySubType)) {
        this.requestBodyMapJsonField.setRequired(true);
    }
    this.requestBodyEnumField.setRequired(false);
    if (TypeEnum.Enum.getLiteral().equals(this.requestBodySubType)) {
        this.requestBodyEnumField.setRequired(true);
    }
}