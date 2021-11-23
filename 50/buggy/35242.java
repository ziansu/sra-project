@java.lang.Override
protected void instantiate() {
    if (instantiated)
        return ;
    
    if (infinite())
        throw new suneido.SuException("can't instantiate infinite sequence");
    
    addAll(iterable);
    instantiated = true;
}