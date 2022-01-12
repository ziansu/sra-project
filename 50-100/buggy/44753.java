@java.lang.Override
protected java.lang.String generatePreamble(lu.fisch.structorizer.elements.Root _root, java.lang.String _indent, lu.fisch.utils.StringList _varNames) {
    if (!(_root.isProgram)) {
        for (int v = 0; v < (_varNames.count()); v++) {
            code.add((((_indent + "my $") + (_varNames.get(v))) + ";"));
        }
    }
    code.add(_indent);
    varNames = _root.getVarNames();
    return _indent;
}