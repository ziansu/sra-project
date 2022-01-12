public semantic.Table lookupFunction(java.lang.String name) {
    if ((parent) != null) {
        parent.lookupFunction(name);
    }else {
        for (semantic.Table t : parent.children) {
            if (t.getSymbol(0).getName().equals(name))
                return t;
            
        }
    }
    return null;
}