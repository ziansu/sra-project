public boolean comparisonParentSquare(java.lang.String child, java.lang.String parent) {
    boolean result = true;
    java.lang.String parentSquareId = this.getParentSquareId(child);
    if ((parentSquareId != null) && ((parentSquareId.length()) > 0))
        result = parentSquareId.equals(parent);
    
    return result;
}