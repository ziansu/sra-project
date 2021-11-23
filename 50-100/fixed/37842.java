public com.mycompany.testverktygdesktop.models.Test getTest(int testId) {
    org.hibernate.Session session = sessionFactory.openSession();
    com.mycompany.testverktygdesktop.models.Test test = ((com.mycompany.testverktygdesktop.models.Test) (session.get(com.mycompany.testverktygdesktop.models.Test.class, testId)));
    test.getQuestions().size();
    session.close();
    return test;
}