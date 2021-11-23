@org.springframework.transaction.annotation.Transactional(readOnly = true)
public java.util.List<?> getStudentList() {
    javax.persistence.Query query = entityManager.createQuery("select c from Student c");
    return query.getResultList();
}