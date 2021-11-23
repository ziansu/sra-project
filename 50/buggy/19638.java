protected boolean isFieldNode() {
    return (isEmptyComparison()) && (org.openl.extension.xmlrules.ProjectData.getCurrentInstance().getFieldNames().contains(fieldName));
}