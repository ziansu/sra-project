public java.lang.String[] getPayFormTypes() {
    Services.PayFormService pfService = new Services.PayFormService();
    java.util.ArrayList<Models.PayForm> payForms = pfService.getAll();
    java.util.ArrayList<java.lang.String> payFormTypes = new java.util.ArrayList<java.lang.String>();
    for (Models.PayForm form : payForms) {
        payFormTypes.add(form.getType());
    }
    return payFormTypes.toArray(new java.lang.String[0]);
}