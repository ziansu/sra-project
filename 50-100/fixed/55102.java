protected static java.lang.String _rewrite(final org.eclipse.ocl.pivot.Model m) {
    org.eclipse.xtend2.lib.StringConcatenation _builder = new org.eclipse.xtend2.lib.StringConcatenation();
    {
        java.util.List<java.lang.Package> _ownedPackages = m.getOwnedPackages();
        for (final java.lang.Package pac : _ownedPackages) {
            java.lang.String _rewrite = fr.emn.atlanmod.uml.casestudy.rewrite.OCL2ATL.rewrite(pac);
            _builder.append(_rewrite);
            _builder.append("\t");
            _builder.newLineIfNotEmpty();
        }
    }
    return _builder.toString();
}