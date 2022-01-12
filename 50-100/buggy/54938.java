static wyil.lang.Type.Impl[] toImplOrVoid(wyil.lang.Type[] types) {
    wyil.lang.Type.Impl[] impls = new wyil.lang.Type.Impl[types.length];
    for (int i = 0; i != (types.length); ++i) {
        wyil.lang.Type type = types[i];
        if (type == (wyil.lang.Type.T_VOID)) {
            return null;
        }else {
            impls[i] = ((wyil.lang.Type.Impl) (types[i]));
        }
    }
    return impls;
}