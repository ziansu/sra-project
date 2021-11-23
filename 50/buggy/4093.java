@java.lang.Override
public org.eclipse.ocl.pivot.Element caseEPackage(org.eclipse.emf.ecore.EPackage object) {
    return converter.getPivotOfEcore(org.eclipse.ocl.pivot.Package.class, object);
}