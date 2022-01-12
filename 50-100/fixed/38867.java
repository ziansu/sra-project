public static java.util.List<ch.njol.skript.Updater.ResponseEntry> deserialize(java.lang.String str) {
    assert str != null : "Cannot deserialize null string";
    @java.lang.SuppressWarnings(value = "serial")
    java.lang.reflect.Type listType = new com.google.common.reflect.TypeToken<java.util.List<ch.njol.skript.Updater.ResponseEntry>>() {    }.getType();
    assert (ch.njol.skript.Updater.gson) != null;
    java.util.List<ch.njol.skript.Updater.ResponseEntry> responses = ch.njol.skript.Updater.gson.fromJson(str, listType);
    assert responses != null;
    return responses;
}