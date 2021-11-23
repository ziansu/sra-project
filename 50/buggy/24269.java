@java.lang.Override
public void writeInterface(com.fasterxml.jackson.core.JsonGenerator generator, io.sentry.event.interfaces.DebugMetaInterface debugMetaInterface) throws java.io.IOException {
    generator.writeStartObject();
    generator.writeObjectFieldStart(io.sentry.marshaller.json.DebugMetaInterfaceBinding.DEBUG_META);
    writeDebugImages(generator, debugMetaInterface);
    generator.writeEndObject();
    generator.writeEndObject();
}