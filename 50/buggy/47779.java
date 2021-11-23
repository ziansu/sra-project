@java.lang.Override
public void saveOrUpdate(ch.fhnw.edu.rental.model.Rental rental) {
    if ((rental.getId()) != 0) {
        em.persist(rental);
    }else {
        em.merge(rental);
    }
}