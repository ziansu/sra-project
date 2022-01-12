private void checkForSharingDeclaration(net.sourceforge.pmd.lang.apex.ast.ApexNode<?> node, java.lang.Object data, boolean sharingFound) {
    final boolean foundAnyDMLorSOQL = (net.sourceforge.pmd.lang.apex.rule.security.Helper.foundAnyDML(node)) || (net.sourceforge.pmd.lang.apex.rule.security.Helper.foundAnySOQLorSOSL(node));
    if (((!sharingFound) && (!(net.sourceforge.pmd.lang.apex.rule.security.Helper.isTestMethodOrClass(node)))) && foundAnyDMLorSOQL) {
        addViolation(data, node);
    }
}