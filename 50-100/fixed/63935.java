private boolean isOperator(java.lang.String s) {
    if ((((s.equals(">")) || (s.equals("<"))) || (s.equals("<>"))) || (s.equals("=")))
        return true;
    
    return false;
}