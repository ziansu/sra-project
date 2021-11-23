@org.springframework.transaction.annotation.Transactional
public boolean delete(com.vicky.pazar.model.Cart carid) {
    java.lang.System.out.println("deletecartimp");
    com.vicky.pazar.model.Cart c = ((com.vicky.pazar.model.Cart) (sessionFactory.getCurrentSession().get(com.vicky.pazar.model.Cart.class, ((java.io.Serializable) (carid)))));
    sessionFactory.getCurrentSession().delete(c);
    return true;
}