@java.lang.Override
public java.lang.Object visitModelType(org.eclipse.m2m.internal.qvt.oml.expressions.ModelType astNode) {
    org.eclipse.m2m.internal.qvt.oml.expressions.ModelType pivotElement = ((org.eclipse.m2m.internal.qvt.oml.expressions.ModelType) (converter.getPivot(astNode)));
    org.eclipse.emf.common.util.EList<java.lang.Package> c = pivotElement.getMetamodel();
    for (org.eclipse.emf.ecore.EPackage ePackage : astNode.getMetamodel()) {
        pivotElement.getMetamodel().add(((java.lang.Package) (metamodelManager.getASOfEcore(org.eclipse.ocl.pivot.Package.class, ePackage))));
    }
    return pivotElement;
}