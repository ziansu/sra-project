@java.lang.Override
public de.ironjan.mensaupb.stw.deserializer.NewAllergen deserialize(de.ironjan.mensaupb.stw.deserializer.JsonParser jp, de.ironjan.mensaupb.stw.deserializer.DeserializationContext ctxt) throws de.ironjan.mensaupb.stw.deserializer.JsonProcessingException, java.io.IOException {
    if ((jp.getCurrentToken()) == (JsonToken.START_OBJECT)) {
    }
    try {
        java.lang.String valueAsString = jp.getValueAsString();
        de.ironjan.mensaupb.stw.deserializer.NewAllergen newAllergen = de.ironjan.mensaupb.stw.deserializer.NewAllergen.fromType(valueAsString);
        return newAllergen;
    } catch (java.lang.IllegalArgumentException e) {
        LOGGER.warn("Could not deserialize Allergen");
        return null;
    }
}