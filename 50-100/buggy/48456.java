@java.lang.Override
public edu.stthomas.gps.familyrecipesystem.entity.Member getMemberByUserName(final java.lang.String username) {
    final org.hibernate.Session session = this.getSessionFactory().getCurrentSession();
    final java.util.List<edu.stthomas.gps.familyrecipesystem.entity.Member> members = session.createQuery("FROM member WHERE username = ?").setParameter(0, username).list();
    if (members.isEmpty()) {
        return null;
    }else {
        return members.get(0);
    }
}