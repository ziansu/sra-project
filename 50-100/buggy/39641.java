private static java.lang.String getCDAName(org.eclipse.uml2.uml.Property cdaProperty) {
    org.eclipse.emf.common.util.EList<org.eclipse.uml2.uml.Property> redefines = cdaProperty.getRedefinedProperties();
    java.lang.String name = org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil.getStereotypeName(cdaProperty);
    if (name != null) {
        return name;
    }
    if ((redefines != null) && ((redefines.size()) > 0)) {
        return org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil.getCDAName(redefines.get(0));
    }
    return cdaProperty.getName();
}