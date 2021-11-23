public static void removeChild(final org.antlr.v4.runtime.tree.ParseTree aChild) {
    if (aChild == null) {
        org.eclipse.titan.common.logging.ErrorReporter.INTERNAL_ERROR("ConfigTreeNodeUtilities.removeChild( ParseTree ): aChild == null");
        return ;
    }
    final org.antlr.v4.runtime.tree.ParseTree parent = aChild.getParent();
    org.eclipse.titan.common.parsers.cfg.ConfigTreeNodeUtilities.removeChild(parent, aChild);
}