private void updateDataset() {
    de.tomsplayground.peanuts.domain.statistics.SecurityCategoryMapping securityCategoryMapping = ((de.tomsplayground.peanuts.client.editors.securitycategory.SecurityCategoryEditorInput) (getEditorInput())).getSecurityCategoryMapping();
    dataset.clear();
    java.util.Map<java.lang.String, java.math.BigDecimal> values = securityCategoryMapping.calculateCategoryValues(inventory);
    for (java.util.Map.Entry<java.lang.String, java.math.BigDecimal> entry : values.entrySet()) {
        if ((entry.getValue().intValue()) != 0) {
            dataset.setValue(entry.getKey(), entry.getValue());
        }
    }
}