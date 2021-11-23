public void removeLoggingSection() {
    if (((loggingSectionHandler) == null) || ((loggingSectionHandler.getLastSectionRoot()) == null)) {
        return ;
    }
    if (loggingSectionHandler.getComponents().isEmpty()) {
        org.eclipse.titan.common.parsers.cfg.ConfigTreeNodeUtilities.removeChild(editor.getParseTreeRoot(), loggingSectionHandler.getLastSectionRoot());
        loggingSectionHandler.setLastSectionRoot(((org.antlr.v4.runtime.ParserRuleContext) (null)));
    }
}