@java.lang.Override
public synchronized orc.run.core.Binding getMember(orc.values.Field f) {
    final java.lang.String field = f.field();
    orc.lib.state.Ref.RefInstance out = map.get(field);
    if (out == null) {
        out = new orc.lib.state.Ref.RefInstance();
        map.put(field, out);
    }
    return new orc.run.core.BoundValue(out);
}