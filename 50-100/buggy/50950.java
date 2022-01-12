public static boolean checkConcept(org.eclipse.xsd.XSDElementDeclaration decl) {
    boolean isConcept = false;
    org.eclipse.emf.common.util.EList l = decl.getIdentityConstraintDefinitions();
    for (java.util.Iterator iter = l.iterator(); iter.hasNext();) {
        org.eclipse.xsd.XSDIdentityConstraintDefinition icd = ((org.eclipse.xsd.XSDIdentityConstraintDefinition) (iter.next()));
        if (icd.getIdentityConstraintCategory().equals(XSDIdentityConstraintCategory.UNIQUE_LITERAL)) {
            isConcept = true;
            break;
        }
    }
    return isConcept;
}