@java.lang.Override
public void writeInterface(com.fasterxml.jackson.core.JsonGenerator generator, io.sentry.event.interfaces.DebugMetaInterface debugMetaInterface) throws java.io.IOException {
    generator.writeStartObject();
    writeDebugImages(generator, debugMetaInterface);
    generator.writeEndObject();
}