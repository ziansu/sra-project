public void regFree(java.lang.String op, java.util.Set<java.lang.String> liveness) {
    java.lang.System.out.println((";Freeing unused variable " + op));
    java.lang.String HashKey = regLookup(op);
    this.map.put(HashKey, "null");
    if (this.dirtyList.contains(op)) {
        java.lang.System.out.println((";Spilling variable: " + op));
        java.lang.System.out.println(((("move " + HashKey) + " ") + (getTinyTransform(op))));
        this.dirtyList.remove(op);
    }
}