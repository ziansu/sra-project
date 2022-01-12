public Type.EffectiveArray expandAsEffectiveArray(wyil.lang.Type type) throws wybs.util.ResolveError {
    if (type instanceof wyil.lang.Type.Array) {
        return ((wyil.lang.Type.Array) (type));
    }else {
        type = expandOneLevel(type);
        if (type instanceof wyil.lang.Type.EffectiveArray) {
            return ((wyil.lang.Type.EffectiveArray) (type));
        }else {
            return null;
        }
    }
}