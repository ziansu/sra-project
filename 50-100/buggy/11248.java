public static <From, To> To convert(From object, java.lang.Class<From> from, java.lang.Class<To> to, org.oscm.dataservice.local.DataService ds) {
    org.oscm.converter.strategy.ConversionStrategy<From, To> converter = org.oscm.converter.strategy.ConversionFactory.getConverter(from, to, ds);
    converter.setDataService(ds);
    return converter.convert(object);
}