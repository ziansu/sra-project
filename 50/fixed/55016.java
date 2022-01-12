public boolean canDecode(java.lang.String fname) {
    java.lang.String[] args = new java.lang.String[]{ fname };
    return (internalGetFormat(convertArguments(args))) != (-1);
}