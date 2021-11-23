@java.lang.Override
protected com.fasterxml.jackson.databind.ser.std.BeanSerializerBase withFilterId(java.lang.Object filterId) {
    return new com.fasterxml.jackson.dataformat.xml.ser.UnwrappingXmlBeanSerializer(this, _objectIdWriter, filterId);
}