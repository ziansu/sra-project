@java.lang.Override
public org.eclipse.jface.text.contentassist.ICompletionProposal[] computeCompletionProposals(org.eclipse.jface.text.ITextViewer viewer, int offset) {
    java.util.List<org.eclipse.jface.text.contentassist.ICompletionProposal> proposals = new java.util.ArrayList<org.eclipse.jface.text.contentassist.ICompletionProposal>();
    viewer.getDocument();
    return proposals.toArray(new org.eclipse.jface.text.contentassist.ICompletionProposal[proposals.size()]);
}