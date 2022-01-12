private static void simpleQuery(hellojpa.EntityManager em) {
    java.util.List<hellojpa.entity.Member> resultList = em.createQuery("select m from Member m where m.age > 18", hellojpa.entity.Member.class).getResultList();
    com.mysema.query.jpa.impl.JPAQuery query = new com.mysema.query.jpa.impl.JPAQuery(em);
    hellojpa.entity.QMember m = hellojpa.entity.QMember.member;
    query.from(m).where(m.age.gt(18).and(m.name.startsWith("hi"))).orderBy(m.age.desc());
    for (hellojpa.entity.Member member : list) {
        java.lang.System.out.println(("member = " + member));
    }
}