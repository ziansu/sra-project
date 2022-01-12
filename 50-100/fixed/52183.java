public static org.modeldriven.alf.eclipse.uml.Element wrap(org.modeldriven.alf.eclipse.uml.Element base) {
    if (base == null) {
        return null;
    }
    org.modeldriven.alf.eclipse.uml.Element newInstance = ((org.modeldriven.alf.eclipse.uml.Element) (org.modeldriven.alf.eclipse.uml.Element.factory.newInstanceFor(base)));
    if (newInstance != null) {
        newInstance.setBase(base);
    }
    return newInstance;
}