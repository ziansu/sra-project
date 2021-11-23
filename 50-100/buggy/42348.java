public static java.util.Map<java.lang.String, java.lang.Object> convertMuzimaForm(final org.openmrs.Form form, final org.openmrs.module.muzima.model.MuzimaForm muzimaForm) {
    java.util.Map<java.lang.String, java.lang.Object> map = new java.util.HashMap<java.lang.String, java.lang.Object>();
    if (form != null) {
        map.put("uuid", form.getUuid());
        map.put("name", form.getName());
        map.put("metaJson", muzimaForm.getMetaJson());
    }
    return map;
}