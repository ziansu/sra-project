public static java.util.Collection<org.eclipse.emf.ecore.EObject> get2(org.eclipse.emf.ecore.EObject main) {
    java.util.Set<org.eclipse.emf.ecore.EObject> elements = new java.util.HashSet<>();
    elements.add(main);
    com.rockwellcollins.spear.File root = ((com.rockwellcollins.spear.File) (com.rockwellcollins.spear.utilities.Utilities.getTopFile(main)));
    com.rockwellcollins.spear.translate.intermediate.FindDependencies.get(root, elements);
    return org.eclipse.xtext.EcoreUtil2.copyAll(elements);
}