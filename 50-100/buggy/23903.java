@java.lang.Override
public <T> org.apache.tamaya.spi.ConfigurationContextBuilder addPropertyConverter(org.apache.tamaya.TypeLiteral<T> typeToConvert, org.apache.tamaya.PropertyConverter<T> propertyConverter) {
    java.util.List<org.apache.tamaya.PropertyConverter<?>> converters = this.propertyConverters.get(typeToConvert);
    if (converters == null) {
        converters = new java.util.ArrayList<>();
        this.propertyConverters.putIfAbsent(typeToConvert, converters);
        converters = this.propertyConverters.get(typeToConvert);
    }
    converters.add(propertyConverter);
    return this;
}