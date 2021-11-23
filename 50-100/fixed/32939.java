public static qowyn.ark.structs.Struct read(javax.json.JsonValue o, qowyn.ark.types.ArkName structType) {
    if (qowyn.ark.structs.StructRegistry.TYPE_JSON_MAP.containsKey(structType)) {
        return qowyn.ark.structs.StructRegistry.TYPE_JSON_MAP.get(structType).apply(o, structType);
    }else {
        return new qowyn.ark.structs.StructPropertyList(o, structType);
    }
}