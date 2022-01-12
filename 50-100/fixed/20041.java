public static java.util.List<eshop.pojo.Product> getAllProducts() {
    org.hibernate.Session s = eshop.hibernate.HibernateUtil.getSession();
    org.hibernate.Transaction t = s.beginTransaction();
    org.hibernate.Query q = s.createQuery("from Product");
    java.util.List<eshop.pojo.Product> result = q.list();
    return result;
}