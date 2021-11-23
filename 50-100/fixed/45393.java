@java.lang.Override
protected void init(java.lang.Class<E> entityClass, com.vaadin.addon.jpacontainer.JPAContainer<E> container, au.com.vaadinutils.crud.HeadingPropertySet<E> headings) {
    setBogusParentFilter();
    super.init(entityClass, container, headings);
    container.setAutoCommit(false);
    if ((buttonLayout) != null) {
        rightLayout.removeComponent(buttonLayout);
    }
}