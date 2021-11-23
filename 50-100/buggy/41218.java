public boolean comparisonParentSquare(java.lang.String child, java.lang.String parent) {
    java.lang.String parentSquareId = this.getParentSquareId(child);
    boolean result = true;
    if ((parentSquareId != null) && ((parentSquareId.length()) > 0))
        result = parentSquareId.equals(parent);
    
    return result;
}