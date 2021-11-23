public static boolean checkConcept(org.eclipse.xsd.XSDElementDeclaration decl) {
    boolean isConcept = false;
    org.eclipse.emf.common.util.EList<org.eclipse.xsd.XSDIdentityConstraintDefinition> list = decl.getIdentityConstraintDefinitions();
    for (java.util.Iterator<org.eclipse.xsd.XSDIdentityConstraintDefinition> iter = list.iterator(); iter.hasNext();) {
        org.eclipse.xsd.XSDIdentityConstraintDefinition icd = iter.next();
        if (icd.getIdentityConstraintCategory().equals(XSDIdentityConstraintCategory.UNIQUE_LITERAL)) {
            isConcept = true;
            break;
        }
    }
    return isConcept;
}