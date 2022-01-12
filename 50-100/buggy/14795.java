@java.lang.Override
public void caseAInstanceVariableDefinition(org.overture.ast.definitions.AInstanceVariableDefinition node) throws org.overture.ast.analysis.AnalysisException {
    java.lang.String name = node.toString();
    if (!(org.overture.ide.ui.templates.VdmCompletionExtractor.VdmHelper.checkForDuplicates(name, dynamicTemplateProposals))) {
        org.overture.ide.ui.templates.VdmCompletionExtractor.VdmHelper.createProposal(node, name, name, "Instance Variable", info, proposals, offset);
        dynamicTemplateProposals.add(name);
    }
}