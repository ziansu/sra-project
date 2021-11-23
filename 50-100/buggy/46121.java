@org.junit.After
public void closeEMF() {
    java.lang.System.out.println("<<<< Closing EMF >>>>");
    java.lang.System.out.println(java.time.LocalDateTime.now());
    java.lang.System.err.println("<<<< Closing EMF >>>>");
    java.lang.System.err.println(java.time.LocalDateTime.now());
    org.jbpm.test.container.JbpmContainerTest.LOGGER.info("<<<< Creating EMF >>>>");
    if ((emf) != null) {
        emf.close();
    }
    emf = null;
}