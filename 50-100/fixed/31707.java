private static org.openl.extension.xmlrules.model.Type getType(java.lang.String typeName) {
    if (typeName == null) {
        return null;
    }
    java.util.Set<org.openl.extension.xmlrules.model.Type> types = org.openl.extension.xmlrules.ProjectData.getCurrentInstance().getTypes();
    org.openl.extension.xmlrules.model.Type xmlRulesType = null;
    for (org.openl.extension.xmlrules.model.Type t : types) {
        if (typeName.equals(t.getName())) {
            xmlRulesType = t;
            break;
        }
    }
    return xmlRulesType;
}