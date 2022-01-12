private jkind.lustre.values.Value convert(java.lang.String base, jkind.lustre.values.Value value) {
    jkind.lustre.Type type = spec.typeMap.get(base);
    if ((type instanceof jkind.lustre.EnumType) && (value != null)) {
        jkind.lustre.EnumType et = ((jkind.lustre.EnumType) (type));
        jkind.lustre.values.IntegerValue iv = ((jkind.lustre.values.IntegerValue) (value));
        return new jkind.lustre.values.EnumValue(et.values.get(iv.value.intValue()));
    }
    return value;
}