@javax.annotation.PostConstruct
public void registerConverters() {
    org.apache.commons.beanutils.BeanUtilsBean.setInstance(new org.apache.commons.beanutils.BeanUtilsBean(this));
    org.apache.commons.beanutils.ConvertUtils.register(new org.happyreaction.services.base.converters.DateTimeConverter(), java.time.LocalDate.class);
    org.apache.commons.beanutils.ConvertUtils.register(new org.happyreaction.services.base.converters.DateTimeConverter(), java.time.LocalDateTime.class);
}