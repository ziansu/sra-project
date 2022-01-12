protected boolean sourceSignatureChanged(java.lang.String tName, java.lang.Compiler compiler) throws java.io.IOException {
    org.teatrove.tea.compiler.TemplateRepository tRepo = org.teatrove.tea.compiler.TemplateRepository.getInstance();
    org.teatrove.tea.compiler.TemplateRepository.TemplateInfo templateInfo = tRepo.getTemplateInfo(tName);
    if (null == templateInfo) {
        return false;
    }
    org.teatrove.tea.compiler.CompilationUnit unit = compiler.getCompilationUnit(tName, null);
    return !(unit.signatureEquals(tName, templateInfo.getParameterTypes(), templateInfo.getReturnType()));
}