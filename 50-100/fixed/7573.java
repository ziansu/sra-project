public static de.zib.vold.common.Key buildkey(java.util.List<java.lang.String> key) throws java.lang.IllegalArgumentException {
    if ((key.size()) < 3) {
        throw new java.lang.IllegalArgumentException((("Tried to build a key out of " + (key.size())) + " arguments. At leest three (scope, type, keyname) of them are necessary."));
    }
    return new de.zib.vold.common.Key(key.get(0), key.get(1), key.get(2));
}