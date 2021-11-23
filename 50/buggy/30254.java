@java.lang.Override
public E deserialize(com.fasterxml.jackson.core.JsonParser jp, com.fasterxml.jackson.databind.DeserializationContext ctxt) throws com.fasterxml.jackson.core.JsonProcessingException, java.io.IOException {
    E[] constants = enumClass.getEnumConstants();
    return constants[((jp.getValueAsInt()) + (getIndexBase()))];
}