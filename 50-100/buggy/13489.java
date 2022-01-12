public boolean isUnknownTypeSerializer(com.fasterxml.jackson.databind.JsonSerializer<?> ser) {
    if ((ser == (_unknownTypeSerializer)) || (ser == null)) {
        return true;
    }
    if (isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS)) {
        if ((ser.getClass()) == (com.fasterxml.jackson.databind.ser.impl.UnknownSerializer.class)) {
            return true;
        }
    }
    return false;
}