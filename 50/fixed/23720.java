public static void setDefaultTypeKey(java.lang.String typeKey) {
    com.alibaba.fastjson.JSON.DEFAULT_TYPE_KEY = typeKey;
    ParserConfig.global.symbolTable.addSymbol(typeKey, 0, typeKey.length(), typeKey.hashCode(), true);
}