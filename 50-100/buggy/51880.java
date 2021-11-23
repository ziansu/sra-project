private void exploreTypes() {
    java.util.List<java.lang.reflect.Type> types = org.osgl.util.Generics.typeParamImplementations(getClass(), act.db.ModelBase.class);
    int sz = types.size();
    if (sz < 1) {
        return ;
    }
    if (sz > 1) {
        modelType = $.cast(types.get(1));
    }
    idType = $.cast(types.get(0));
}