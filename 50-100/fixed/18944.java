public void regFree(java.lang.String op, java.util.Set<java.lang.String> liveness) {
    java.lang.System.out.println((";Freeing unused variable " + op));
    java.lang.String key = regLookup(op);
    this.map.put(key, "null");
    if (this.dirtyList.contains(op)) {
        java.lang.System.out.println((";Spilling variable: " + op));
        java.lang.System.out.println(((("move " + key) + " ") + (getTinyTransform(op))));
        this.dirtyList.remove(op);
    }
}