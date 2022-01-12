@org.junit.Before
public void prepareBeanMapper() {
    beanMapper = new io.beanmapper.BeanMapper();
    beanMapper.addPackagePrefix(io.beanmapper.BeanMapper.class);
    beanMapper.addConverter(new io.beanmapper.core.converter.impl.LocalDateTimeToLocalDate());
    beanMapper.addConverter(new io.beanmapper.core.converter.impl.LocalDateToLocalDateTime());
    beanMapper.addConverter(new io.beanmapper.core.converter.impl.ObjectToStringConverter());
    beanMapper.addConverter(new io.beanmapper.core.converter.impl.NestedSourceClassToNestedTargetClassConverter(beanMapper));
    beanMapper.addProxySkipClass(java.lang.Enum.class);
}