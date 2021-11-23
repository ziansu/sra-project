public io.github.endreman0.javajson.nodes.ObjectNode put(java.lang.String key, io.github.endreman0.javajson.nodes.Node value) {
    boolean isSet = false;
    for (io.github.endreman0.javajson.nodes.Field field : fields) {
        if (field.getKey().equals(key)) {
            field.setValue(value);
            isSet = true;
            break;
        }
    }
    if (!isSet)
        fields.add(new io.github.endreman0.javajson.nodes.Field(key, value));
    
    value.parent = this;
    return this;
}