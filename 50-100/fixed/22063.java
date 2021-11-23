@java.lang.Override
public java.lang.Object get(be.nabu.glue.core.api.CollectionIterable collection, java.lang.Integer index) {
    if ((collection == null) || (index >= (be.nabu.glue.core.impl.methods.ScriptMethods.size(collection)))) {
        return null;
    }
    java.lang.Iterable<?> start = be.nabu.glue.core.impl.methods.v2.SeriesMethods.offset(index, collection);
    return be.nabu.glue.core.impl.methods.v2.SeriesMethods.first(start);
}