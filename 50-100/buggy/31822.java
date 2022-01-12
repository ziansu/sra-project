public static java.lang.String toJson(java.lang.Object fromBean, boolean prettyPrint, boolean sort, boolean ignoreNull) {
    org.nybatis.core.reflection.mapper.NObjectMapper mapper = (sort) ? org.nybatis.core.reflection.Reflector.objectMapperSorted : org.nybatis.core.reflection.Reflector.objectMapper;
    mapper.setSerializationInclusion((ignoreNull ? com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL : com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS));
    com.fasterxml.jackson.databind.ObjectWriter writer = (prettyPrint) ? mapper.writerWithDefaultPrettyPrinter() : mapper.writer();
    try {
        return writer.writeValueAsString(fromBean);
    } catch (java.io.IOException e) {
        throw new org.nybatis.core.exception.unchecked.JsonIOException(e);
    }
}