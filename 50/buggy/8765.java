@org.springframework.context.annotation.Bean
org.springframework.core.convert.ConversionService conversionService() {
    org.springframework.core.convert.support.DefaultConversionService registry = new org.springframework.core.convert.support.DefaultConversionService();
    registry.addConverter(new org.molgenis.data.convert.DateToStringConverter());
    registry.addConverter(new org.molgenis.data.convert.StringToDateConverter());
    return registry;
}