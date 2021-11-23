public boolean isBetween(int startOffset, int endOffset) {
    org.eclipse.jface.text.Position pos = node.getPosition();
    if ((startOffset <= (pos.offset)) && (((pos.length) + (pos.offset)) < endOffset))
        return true;
    
    return false;
}