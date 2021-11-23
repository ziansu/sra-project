protected static java.lang.String _gen(final org.eclipse.ocl.pivot.TypeExp e) {
    org.eclipse.xtend2.lib.StringConcatenation _builder = new org.eclipse.xtend2.lib.StringConcatenation();
    java.lang.String _replace = e.getReferredType().toString().replace("::", "!");
    _builder.append(_replace);
    return _builder.toString();
}