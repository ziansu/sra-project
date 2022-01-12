@org.junit.Test
public void batchOpenAdminLevels() {
    java.util.Map<org.activityinfo.model.resource.ResourceId, org.activityinfo.model.form.FormClass> formClasses = catalog.getFormClasses(java.util.Arrays.asList(adminLevelFormClass(1), adminLevelFormClass(2)));
    org.activityinfo.model.form.FormClass provinceClass = formClasses.get(adminLevelFormClass(1));
    org.activityinfo.model.form.FormClass territoryClass = formClasses.get(adminLevelFormClass(2));
    assertThat(provinceClass.getLabel(), org.hamcrest.Matchers.equalTo("Province"));
    assertThat(territoryClass.getLabel(), org.hamcrest.Matchers.equalTo("Territoire"));
}