public static qowyn.ark.structs.Struct read(javax.json.JsonValue o, qowyn.ark.types.ArkName structType) {
    java.lang.String structTypeString = structType.toString();
    if (qowyn.ark.structs.StructRegistry.TYPE_JSON_MAP.containsKey(structTypeString)) {
        return qowyn.ark.structs.StructRegistry.TYPE_JSON_MAP.get(structTypeString).apply(o, structType);
    }else {
        return new qowyn.ark.structs.StructPropertyList(o, structType);
    }
}