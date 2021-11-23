@java.lang.Override
public void serialize(javax.xml.namespace.QName value, com.fasterxml.jackson.core.JsonGenerator jgen, com.fasterxml.jackson.databind.SerializerProvider provider) throws java.io.IOException {
    jgen.writeString(com.evolveum.midpoint.util.QNameUtil.qNameToUri(value, false));
}