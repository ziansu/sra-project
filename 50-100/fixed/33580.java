private java.lang.StringBuilder writeFields(com.unknownpotato.ohtu.miniproj.domain.Reference ref, java.lang.StringBuilder builder) {
    java.lang.String value = "";
    for (java.lang.String field : ref.getFieldKeys()) {
        value = ref.getField(field);
        if (!(value.isEmpty())) {
            builder.append(field);
            builder.append(" = \"");
            builder.append(value);
            builder.append("\",\n");
        }
    }
    builder.append("}\n");
    return builder;
}