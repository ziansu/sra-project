public java.lang.String getScopeName() {
    java.lang.String scopeName = "";
    if ((formattedScope) == null)
        return null;
    
    if (formattedScope.equals("0"))
        scopeName = "Full";
    
    if (formattedScope.equals("1"))
        scopeName = "Broad";
    
    if (formattedScope.equals("2"))
        scopeName = "Narrow";
    
    if (formattedScope.equals("3"))
        scopeName = "Child/Narrow";
    
    return scopeName;
}