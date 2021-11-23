public java.util.List<com.renovator.pojo.User> getUserList() {
    return ((java.util.List<com.renovator.pojo.User>) (sessionFactory.getCurrentSession().createQuery("from com.renovator.pojo.User")));
}