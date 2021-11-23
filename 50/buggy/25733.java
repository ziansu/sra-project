public static fhirconverter.spark.Representation fromString(java.lang.String repr_string) {
    fhirconverter.spark.Representation repr = fhirconverter.spark.Representation.JSON;
    fhirconverter.spark.Representation.LOGGER.debug(("Format Received: " + repr_string));
    if (repr_string.matches(fhirconverter.spark.Representation.XML_STRINGS_REGEX)) {
        repr = fhirconverter.spark.Representation.XML;
    }
    return repr;
}