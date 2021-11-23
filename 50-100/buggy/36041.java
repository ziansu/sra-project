private void addLoggingBit(final java.util.Map<org.eclipse.titan.common.parsers.cfg.indices.LoggingBit, org.antlr.v4.runtime.tree.ParseTree> bitMask, final org.antlr.v4.runtime.tree.ParseTree bitmaskRoot, final org.eclipse.titan.common.parsers.cfg.indices.LoggingBit bit) {
    org.antlr.v4.runtime.tree.ParseTree newBit = new org.eclipse.titan.common.parsers.AddedParseTree(bit.getName());
    bitMask.put(bit, newBit);
    if ((bitMask.keySet().size()) > 1) {
        org.antlr.v4.runtime.tree.ParseTree separator = new org.eclipse.titan.common.parsers.AddedParseTree("|");
        org.eclipse.titan.common.parsers.cfg.ConfigTreeNodeUtilities.addChild(bitmaskRoot, separator, 0);
    }
    org.eclipse.titan.common.parsers.cfg.ConfigTreeNodeUtilities.addChild(bitmaskRoot, newBit, 0);
}