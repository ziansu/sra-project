@java.lang.SuppressWarnings(value = "unchecked")
public java.util.List<com.mydoctor.model.AssignedUser> getAssignedUser(java.lang.String doctorId) {
    org.hibernate.Session session = sessionFactory.getCurrentSession();
    org.hibernate.Query query = session.createQuery("from AssignedUser as au where au.doctorname = :doctorname");
    query.setParameter("doctorname", doctorId);
    java.util.List<com.mydoctor.model.AssignedUser> userList = query.list();
    java.lang.System.out.println(userList.get(0).toString());
    return userList;
}