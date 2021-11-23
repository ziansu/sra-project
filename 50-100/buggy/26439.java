@java.lang.Override
public void serialize(com.fasterxml.jackson.core.JsonGenerator gen, com.fasterxml.jackson.databind.SerializerProvider serializerProvider) throws java.io.IOException {
    gen.writeStartArray();
    while (this.df.hasNext()) {
        this.objGen.transform(this.df).serialize(gen, serializerProvider);
    } 
    gen.writeEndArray();
    this.df.close(this.isInTransaction);
}