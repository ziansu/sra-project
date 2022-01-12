protected com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> getSer(com.fasterxml.jackson.databind.BeanProperty writer) throws com.fasterxml.jackson.databind.JsonMappingException {
    com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> ser = null;
    if (writer instanceof com.fasterxml.jackson.databind.ser.BeanPropertyWriter) {
        ser = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter) (writer)).getSerializer();
    }
    if ((ser == null) && (!(java2typescript.jackson.module.visitors.TSJsonObjectFormatVisitor.ignorableTypes.contains(type.getName())))) {
        ser = getProvider().findValueSerializer(writer.getType(), writer);
    }
    return ser;
}