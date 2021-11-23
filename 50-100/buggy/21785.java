static java.lang.Iterable<org.eclipse.uml2.uml.EnumerationLiteral> getSmallEnumeration(org.eclipse.uml2.uml.Enumeration enumeration) {
    java.util.List<org.eclipse.uml2.uml.EnumerationLiteral> literals = enumeration.getOwnedLiterals();
    return ((literals.size()) > 0) && ((literals.size()) < 400) ? literals : null;
}