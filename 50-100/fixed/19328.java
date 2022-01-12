@org.springframework.transaction.annotation.Transactional
public boolean delete(java.lang.String carid) {
    java.lang.System.out.println("deletecartimp");
    com.vicky.pazar.model.Cart c = ((com.vicky.pazar.model.Cart) (sessionFactory.getCurrentSession().get(com.vicky.pazar.model.Cart.class, carid)));
    sessionFactory.getCurrentSession().delete(c);
    return true;
}