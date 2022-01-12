@java.lang.Override
public void check(final org.eclipse.titan.designer.parsers.CompilationTimeStamp timestamp) {
    if ((null != (lastCompilationTimeStamp)) && (!(lastCompilationTimeStamp.isLess(timestamp)))) {
        return ;
    }
    lastCompilationTimeStamp = timestamp;
    if (!(SpecialASN1Module.INTERNAL_MODULE.equals(identifier.getAsnName()))) {
        org.eclipse.titan.designer.AST.NamingConventionHelper.checkConvention(PreferenceConstants.REPORTNAMINGCONVENTION_ASN1MODULE, identifier, "ASN.1 module");
    }
    imports.check(timestamp);
    assignments.check(timestamp);
}