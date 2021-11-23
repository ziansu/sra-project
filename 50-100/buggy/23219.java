protected final <T extends Capsule> T sup(java.lang.Class<T> caplet) {
    if (caplet == (getClass()))
        throw new java.lang.IllegalArgumentException((("Called with " + (caplet.getName())) + " on the same class."));
    
    for (Capsule c = this; c != null; c = c.sup) {
        if (caplet.isInstance(c))
            return caplet.cast(c);
        
    }
    return null;
}