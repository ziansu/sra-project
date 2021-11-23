@java.lang.Override
public org.eclipse.jface.text.contentassist.IContentAssistant getContentAssistant(final org.eclipse.jface.text.source.ISourceViewer sourceViewer) {
    final org.eclipse.jface.text.contentassist.ContentAssistant assistant = new org.eclipse.jface.text.contentassist.ContentAssistant();
    assistant.setContentAssistProcessor(new eu.modelwriter.core.alloyinecore.ui.editor.completion.AIECompletionProcessor(), IDocument.DEFAULT_CONTENT_TYPE);
    assistant.setAutoActivationDelay(500);
    assistant.enableAutoActivation(true);
    assistant.enableAutoInsert(true);
    assistant.setProposalPopupOrientation(IContentAssistant.PROPOSAL_OVERLAY);
    assistant.setContextInformationPopupOrientation(IContentAssistant.CONTEXT_INFO_ABOVE);
    return assistant;
}