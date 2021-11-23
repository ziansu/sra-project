@org.springframework.transaction.annotation.Transactional(readOnly = true)
public java.util.List<lt.vtvpmc.ems.pw.entities.Student> getStudentList() {
    javax.persistence.Query q = entityManager.createQuery("select c from Student c");
    return q.getResultList();
}