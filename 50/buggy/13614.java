public edu.neu.lovesports.orm.models.User read(java.lang.String username) {
    edu.neu.lovesports.orm.models.User user = em.find(edu.neu.lovesports.orm.models.User.class, username);
    em.refresh(user);
    return user;
}