private static java.lang.String getValue(java.lang.String key) {
    if (com.kerbybit.chattriggers.objects.JsonHandler.jsons.containsKey(key)) {
        return (com.kerbybit.chattriggers.objects.JsonHandler.jsons.get(key)) + "";
    }
    return "Not a json";
}