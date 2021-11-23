@java.lang.Override
protected void writeSequenceField(final java.lang.String name, final com.stanfy.helium.model.Type itemType, final java.util.List<?> value, final com.google.gson.stream.JsonWriter out) throws java.io.IOException {
    out.name(name);
    com.stanfy.helium.model.Sequence seq = new com.stanfy.helium.model.Sequence();
    seq.setItemsType(itemType);
    new com.stanfy.helium.entities.json.JsonConvertersPool.JsonSequenceConverter(seq).write(out, value);
}