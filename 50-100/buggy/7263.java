protected static java.lang.String _gen(final org.eclipse.ocl.pivot.TypeExp e) {
    org.eclipse.xtend2.lib.StringConcatenation _builder = new org.eclipse.xtend2.lib.StringConcatenation();
    org.eclipse.ocl.pivot.Type _referredType = e.getReferredType();
    java.lang.String _string = _referredType.toString();
    java.lang.String _replace = _string.replace("::", "!");
    _builder.append(_replace, "");
    return _builder.toString();
}