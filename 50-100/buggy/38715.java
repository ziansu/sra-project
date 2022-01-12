public static java.lang.Object unproxy(java.lang.Object object) {
    java.lang.Object result = object;
    if ((object != null) && (org.malaguna.cmdit.service.reflection.HibernateProxyUtils.isProxy(object))) {
        org.hibernate.Hibernate.initialize(object);
        org.hibernate.proxy.HibernateProxy proxy = ((org.hibernate.proxy.HibernateProxy) (object));
        result = proxy.getHibernateLazyInitializer().getImplementation();
    }
    return result;
}