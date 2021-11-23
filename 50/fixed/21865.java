@java.lang.Override
public void saveProduct(net.hemanth.onlinemanagement.dto.Product p) {
    sessionFactory.getCurrentSession().saveOrUpdate(p);
}