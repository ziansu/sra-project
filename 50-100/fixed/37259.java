protected static java.lang.String _gen(final org.eclipse.ocl.pivot.OppositePropertyCallExp e) {
    org.eclipse.xtend2.lib.StringConcatenation _builder = new org.eclipse.xtend2.lib.StringConcatenation();
    java.lang.String _gen = fr.emn.atlanmod.uml.casestudy.rewrite.OCL.gen(e.getOwnedSource());
    _builder.append(_gen);
    _builder.append(".");
    java.lang.String _name = e.getReferredProperty().getName();
    _builder.append(_name);
    return _builder.toString();
}