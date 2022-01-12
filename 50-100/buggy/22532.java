public void load(final nz.co.senanque.pizzaorder.instances.Pizza pizza) {
    m_panel.removeAllComponents();
    getMaduraSessionManager().getValidationSession().bind(pizza);
    com.vaadin.data.util.BeanItem<nz.co.senanque.pizzaorder.instances.Pizza> beanItem = new com.vaadin.data.util.BeanItem<nz.co.senanque.pizzaorder.instances.Pizza>(pizza);
    m_fieldGroup = getMaduraSessionManager().createMaduraFieldGroup();
    m_fieldGroup.buildAndBind(m_panel, fieldList, beanItem);
}