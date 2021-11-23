public entity.Hobby getHobby(int id) {
    javax.persistence.EntityManager em = getEntityManager();
    entity.Hobby hobby;
    try {
        hobby = em.find(entity.Hobby.class, id);
    } finally {
        em.close();
    }
    return hobby;
}