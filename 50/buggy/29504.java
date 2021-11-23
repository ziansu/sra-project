@java.lang.Override
public void persist(eu.learnpad.ca.rest.data.collaborative.AnnotatedCollaborativeContentAnalyses ar) {
    em = emFactory.createEntityManager();
    em.persist(ar);
}