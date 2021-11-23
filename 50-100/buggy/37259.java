protected static java.lang.String _gen(final org.eclipse.ocl.pivot.OppositePropertyCallExp e) {
    org.eclipse.xtend2.lib.StringConcatenation _builder = new org.eclipse.xtend2.lib.StringConcatenation();
    org.eclipse.ocl.pivot.OCLExpression _ownedSource = e.getOwnedSource();
    java.lang.String _gen = fr.emn.atlanmod.uml.casestudy.rewrite.OCL.gen(_ownedSource);
    _builder.append(_gen, "");
    _builder.append(".");
    org.eclipse.ocl.pivot.Property _referredProperty = e.getReferredProperty();
    java.lang.String _name = _referredProperty.getName();
    _builder.append(_name, "");
    return _builder.toString();
}