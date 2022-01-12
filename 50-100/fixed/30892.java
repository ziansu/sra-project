protected void _format(org.eclipse.xtext.resource.XtextResource resource, org.eclipse.xtext.formatting2.IFormattableDocument document) {
    java.util.List<org.eclipse.emf.ecore.EObject> contents = resource.getContents();
    if (!(contents.isEmpty())) {
        org.eclipse.emf.ecore.EObject model = contents.get(0);
        document.format(model);
    }
}