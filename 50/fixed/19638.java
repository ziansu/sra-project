protected boolean isFieldNode() {
    return (((node) != null) && (isEmptyComparison())) && (org.openl.extension.xmlrules.ProjectData.getCurrentInstance().getFieldNames().contains(fieldName));
}