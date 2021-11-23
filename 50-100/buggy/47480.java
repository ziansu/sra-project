@java.lang.Override
public java.lang.Object visitEnumEntryPMD(org.jetbrains.kotlin.psi.JetEnumEntry node, java.lang.Object data) {
    java.lang.String neededDelimiter = enumEntryExpectedDelimiter(node);
    if (!(neededDelimiter.isEmpty())) {
        addViolation(getSavedData(), node.<net.sourceforge.pmd.lang.ast.Node>getCopyableUserData(KotlinASTNodeAdapter.OUTER_NODE_KEY));
    }
    return super.visitEnumEntryPMD(node, data);
}