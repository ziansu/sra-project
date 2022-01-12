public final void attach(final java.lang.Object... parts) {
    for (java.lang.Object part : parts) {
        if (has(part.getClass())) {
            throw new java.lang.IllegalArgumentException((("Part of type " + (part.getClass().getName())) + " is already attached."));
        }
        this.parts.put(part.getClass(), part);
    }
}