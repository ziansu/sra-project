@java.lang.Override
public void apply(org.eclipse.emf.ecore.EObject element, org.eclipse.xtext.ui.editor.model.edit.IModificationContext context) throws java.lang.Exception {
    java.lang.StringBuilder bld = new java.lang.StringBuilder();
    bld.append("\"");
    getResolvedMetadataVersion(element).toString(bld);
    bld.append("\"");
    context.getXtextDocument().replace(issue.getOffset(), issue.getLength(), bld.toString());
}