@java.lang.Override
public boolean apply(org.eclipse.emf.ecore.resource.Resource.Diagnostic input) {
    return !((input instanceof org.eclipse.xtext.validation.EObjectDiagnosticImpl) && (markerType.contentEquals(((org.eclipse.xtext.validation.EObjectDiagnosticImpl) (input)).getCode())));
}