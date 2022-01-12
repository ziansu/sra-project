private org.eclipse.xtext.parser.indentation.indentationAwareTestLanguage.Tree parseAndValidate(final java.lang.CharSequence s) {
    final org.eclipse.xtext.parser.indentation.indentationAwareTestLanguage.Tree result = this.parse(s);
    this.validationTestHelper.assertNoIssues(result);
    org.eclipse.emf.ecore.resource.Resource _eResource = result.eResource();
    final org.eclipse.xtext.resource.XtextResource resource = ((org.eclipse.xtext.resource.XtextResource) (_eResource));
    final org.eclipse.xtext.nodemodel.ICompositeNode node = resource.getParseResult().getRootNode();
    this.invariantChecker.checkInvariant(node);
    return result;
}