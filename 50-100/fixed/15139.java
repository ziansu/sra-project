protected void configureMultilineComments(org.eclipse.xtext.ui.editor.autoedit.IEditStrategyAcceptor acceptor) {
    acceptor.accept(singleLineTerminals.newInstance("/*", " */"), IDocument.DEFAULT_CONTENT_TYPE);
    acceptor.accept(multiLineTerminals.newInstance("/***", " * ", " ***/"), IDocument.DEFAULT_CONTENT_TYPE);
    acceptor.accept(multiLineTerminals.newInstance("/***", " * ", " ***/"), TerminalsTokenTypeToPartitionMapper.COMMENT_PARTITION);
    acceptor.accept(multiLineTerminals.newInstance("/*", " * ", " */"), IDocument.DEFAULT_CONTENT_TYPE);
    acceptor.accept(multiLineTerminals.newInstance("/*", " * ", " */"), TerminalsTokenTypeToPartitionMapper.COMMENT_PARTITION);
}