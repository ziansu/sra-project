@java.lang.Override
public org.apache.kerby.kerberos.kerb.spec.KerberosTime deserialize(com.google.gson.JsonElement jsonElement, java.lang.reflect.Type type, com.google.gson.JsonDeserializationContext jsonDeserializationContext) throws com.google.gson.JsonParseException {
    java.lang.String timeString = jsonElement.getAsString();
    long time = java.lang.Long.valueOf(timeString);
    return new org.apache.kerby.kerberos.kerb.spec.KerberosTime(time);
}