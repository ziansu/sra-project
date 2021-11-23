@java.lang.Override
public com.google.gson.JsonElement serialize(final nl.shadowlink.shadowgtalib.utils.Constants.GameType pGameType, final java.lang.reflect.Type typeOfSrc, final com.google.gson.JsonSerializationContext context) {
    return new com.google.gson.JsonPrimitive(pGameType.getGameName());
}