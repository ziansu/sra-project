public void removeContact(java.lang.Integer id) {
    model.Contact contact = ((model.Contact) (sessionFactory.getCurrentSession().get(model.Contact.class, id)));
    if (null != contact) {
        sessionFactory.getCurrentSession().delete(contact);
    }
}