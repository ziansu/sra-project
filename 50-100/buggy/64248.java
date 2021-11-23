@java.lang.Override
public wyil.lang.Type.EffectiveRecord update(java.lang.String field, wyil.lang.Type type) {
    wyil.lang.Type.Impl.Record[] records = new wyil.lang.Type.Impl.Record[elements.length];
    for (int i = 1; i != (elements.length); ++i) {
        records[i] = ((wyil.lang.Type.Impl.Record) (elements[i].update(field, type)));
    }
    return ((wyil.lang.Type.EffectiveRecord) (wyil.lang.Type.Union(records)));
}