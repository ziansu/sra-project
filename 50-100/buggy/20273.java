@org.junit.Test
public void siteFormClassWithNullaryLocations() {
    org.activityinfo.model.form.FormClass formClass = catalog.getForm(activityFormClass(org.activityinfo.store.mysql.ADVOCACY)).get().getFormClass();
    java.util.Set<java.lang.String> codes = new java.util.HashSet<>();
    for (org.activityinfo.model.form.FormField formField : formClass.getFields()) {
        codes.add(formField.getCode());
    }
    assertThat(codes, not(org.hamcrest.Matchers.hasItem("location")));
}