public static org.modeldriven.alf.eclipse.uml.Element wrap(org.modeldriven.alf.eclipse.uml.Element base) {
    if (base == null) {
        return null;
    }
    org.modeldriven.alf.eclipse.uml.Element newInstance = ((org.modeldriven.alf.eclipse.uml.Element) (org.modeldriven.alf.eclipse.uml.Element.factory.newInstanceFor(base, org.eclipse.uml2.uml.Behavior.class, org.eclipse.uml2.uml.Class.class, org.eclipse.uml2.uml.NamedElement.class)));
    if (newInstance != null) {
        newInstance.setBase(base);
    }
    return newInstance;
}