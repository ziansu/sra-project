private static void checkAndUpdateBooleanAliases(java.util.Map<java.lang.String, java.lang.reflect.Field> nameToFieldMap, java.util.Map<java.lang.String, java.lang.String> booleanAliasMap, java.lang.String optionName) {
    com.google.devtools.common.options.IsolatedOptionsData.checkForCollisions(nameToFieldMap, ("no_" + optionName), "boolean option alias");
    com.google.devtools.common.options.IsolatedOptionsData.checkForCollisions(nameToFieldMap, ("no" + optionName), "boolean option alias");
    booleanAliasMap.put(("no_" + optionName), optionName);
    booleanAliasMap.put(("no" + optionName), optionName);
}