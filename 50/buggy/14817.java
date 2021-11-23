@java.lang.Override
protected com.google.javascript.jscomp.CompilerOptions getOptions() {
    com.google.javascript.jscomp.CompilerOptions options = super.getOptions();
    options.setLanguageOut(LanguageMode.ECMASCRIPT6_TYPED);
    options.checkTypes = parseTypeInfo;
    options.setRenamingPolicy(VariableRenamingPolicy.ALL, PropertyRenamingPolicy.ALL_UNQUOTED);
    return options;
}