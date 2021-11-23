@java.lang.Override
public void saveProduct(net.hemanth.onlinemanagement.dto.Product p) {
    java.lang.System.out.println(p.getName());
    sessionFactory.getCurrentSession().saveOrUpdate(p);
}