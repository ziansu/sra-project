public final void attach(final java.lang.Object part) {
    if (has(part.getClass())) {
        throw new java.lang.IllegalArgumentException((("Part of type " + (part.getClass().getName())) + " is already attached."));
    }
    parts.put(part.getClass(), part);
}