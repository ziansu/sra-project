public java.util.List<com.mycompany.testverktygbackend.models.User> getUsers() {
    org.hibernate.Session session = com.mycompany.testverktygbackend.repository.NewHibernateUtil.getSession();
    session.beginTransaction();
    java.util.List<com.mycompany.testverktygbackend.models.User> users = session.createCriteria(com.mycompany.testverktygbackend.models.User.class).list();
    for (com.mycompany.testverktygbackend.models.User user : users) {
        user.getCourses().size();
        user.getResponse().size();
        java.lang.System.out.println(("user.getResponse().size() *** " + (user.getResponse().size())));
    }
    session.close();
    return users;
}