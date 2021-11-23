@android.support.annotation.NonNull
private static java.util.ArrayList<org.dhis2.mobile.io.models.Field> getValidatedFieldList(org.dhis2.mobile.io.models.Group group, org.dhis2.mobile.io.holders.DataSetCategoryOptions dataSetCategoryOptions, boolean defaultSection) {
    java.util.ArrayList<org.dhis2.mobile.io.models.Field> validFields = new java.util.ArrayList<>();
    for (int i = 0; i < (group.getFields().size()); i++) {
        org.dhis2.mobile.io.models.Field field = group.getFields().get(i);
        org.dhis2.mobile.processors.DataSetMetaData.checkIfAFieldIsValid(validFields, field, group.getLabel(), dataSetCategoryOptions, defaultSection);
    }
    return validFields;
}