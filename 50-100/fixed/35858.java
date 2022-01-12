public java.util.Collection<entitybeans.Projects> getUserVisibleProjects(entitybeans.Users user) {
    java.util.Collection<entitybeans.Projects> userVisibleProjects = new java.util.ArrayList();
    javax.persistence.Query q = em.createNamedQuery("Projects.findInUsersWorkgroup", entitybeans.Projects.class);
    q.setParameter(1, user.getIdusers());
    userVisibleProjects.addAll(q.getResultList());
    userVisibleProjects.addAll(getUserOwnedProjects(user));
    userVisibleProjects.addAll(getAllPublicProjects());
    return userVisibleProjects;
}