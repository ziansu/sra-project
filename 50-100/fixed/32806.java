@java.lang.Override
public void updateSyntax(final org.eclipse.titan.designer.parsers.ttcn3parser.TTCN3ReparseUpdater reparser, final boolean isDamaged) throws org.eclipse.titan.designer.parsers.ttcn3parser.ReParseException {
    if (isDamaged) {
        throw new org.eclipse.titan.designer.parsers.ttcn3parser.ReParseException();
    }
    if ((reference) != null) {
        reference.updateSyntax(reparser, false);
        reparser.updateLocation(reference.getLocation());
    }
}