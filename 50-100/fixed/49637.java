public float getSimpleParam(java.lang.String paramJsonName) throws java.lang.IllegalStateException {
    if (zeinhijazi.com.pmeas.effects.Effect.isComplex(type, paramJsonName)) {
        throw new java.lang.IllegalStateException(((type.displayName) + " is a complex type"));
    }else {
        return ((java.lang.Float) (params.get(paramJsonName)));
    }
}