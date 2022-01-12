public semantic.Table lookupFunction(java.lang.String name) {
    int nodeNum;
    while ((parent) != null) {
        parent.lookupFunction(name);
    } 
    for (semantic.Table t : parent.children) {
        nodeNum = (t.getSymbol(0).getType().equals("function name")) ? 0 : 1;
        if (t.getSymbol(nodeNum).getName().equals(name))
            return t;
        
    }
    return null;
}