private int inferIndentationLevel(java.lang.String reference, int tabSize, int indentSize) {
    java.lang.StringBuffer expanded = org.eclipse.wst.jsdt.internal.ui.text.comment.CommentFormattingStrategy.expandTabs(reference, tabSize);
    int referenceWidth = expanded.length();
    if (tabSize == 0)
        return referenceWidth;
    
    int level = referenceWidth / indentSize;
    if ((referenceWidth % indentSize) > 0)
        level++;
    
    return level;
}