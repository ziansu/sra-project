void addAlias(java.lang.String alias) throws java.lang.IllegalArgumentException {
    names.add(alias);
    if (options.containsKey(alias)) {
        throw new java.lang.IllegalArgumentException((("** Programmer error! Option " + alias) + " already defined"));
    }
    options.put(alias, this);
}