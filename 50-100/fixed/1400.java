@java.lang.Override
public java.lang.Object visitPropertyCallExp(org.eclipse.ocl.expressions.PropertyCallExp<org.eclipse.emf.ecore.EClassifier, org.eclipse.emf.ecore.EStructuralFeature> astNode) {
    org.eclipse.ocl.expressions.PropertyCallExp pivotElement = converter.addCreated(astNode, PivotFactory.eINSTANCE.createPropertyCallExp());
    pivotElement.setOwnedSource(doProcess(org.eclipse.ocl.pivot.OCLExpression.class, astNode.getSource()));
    return pivotElement;
}