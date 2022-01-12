@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public java.util.List<com.cooksys.fastbook.models.PostWithLikeData> getPostsForUser(java.lang.Integer userId, java.lang.Integer loggedInId) {
    org.hibernate.Session session = sessionFactory.getCurrentSession();
    java.lang.String hql = "select new com.cooksys.fastbook.models.PostWithLikeData(p, count(p.id), " + ((((((("CASE l.user.id WHEN :loggedInId THEN true " + "ELSE false END) ") + "from User u ") + "inner join u.posts p ") + "left join p.likes l ") + "where u.id = :userId ") + "group by p.id ") + "order by p.timestamp desc");
    return session.createQuery(hql).setParameter("userId", userId).setParameter("loggedInId", loggedInId).list();
}