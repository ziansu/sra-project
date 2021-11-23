private void requestBodySubTypeFieldAjaxUpdate(org.apache.wicket.ajax.AjaxRequestTarget target) {
    if (TypeEnum.Map.getLiteral().equals(this.requestBodySubType)) {
        this.requestBodyMapJsonField.setRequired(true);
    }else {
        this.requestBodyMapJsonField.setRequired(false);
    }
    if (TypeEnum.Enum.getLiteral().equals(this.requestBodySubType)) {
        this.requestBodyEnumField.setRequired(true);
    }else {
        this.requestBodyEnumField.setRequired(false);
    }
}