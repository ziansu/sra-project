public org.openmrs.module.bahmni.ie.apps.model.BahmniFormResource map(org.openmrs.FormResource formResource) {
    org.openmrs.module.bahmni.ie.apps.model.BahmniFormResource bahmniFormResource = new org.openmrs.module.bahmni.ie.apps.model.BahmniFormResource();
    bahmniFormResource.setValue(formResource.getValue().toString());
    bahmniFormResource.setUuid(formResource.getUuid());
    bahmniFormResource.setForm(map(formResource.getForm()));
    return bahmniFormResource;
}