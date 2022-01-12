public static java.util.List<eshop.pojo.Product> getAllProducts() {
    org.hibernate.Session s = eshop.hibernate.HibernateUtil.getSession();
    org.hibernate.Transaction t = s.beginTransaction();
    org.hibernate.Query q = s.createQuery("from Product");
    s.close();
    return q.list();
}