public static void main(java.lang.String[] args) throws java.io.IOException {
    try {
        fitnesse.testsystems.slim.SslSlimClientBuilderTest test = new fitnesse.testsystems.slim.SslSlimClientBuilderTest();
        test.setUp();
        java.lang.System.out.println("----1 ---");
        test.StartAndConnectToSlimClientWithoutSsl();
        java.lang.System.out.println("----2 ---");
        test.StartAndConnectToSlimClientWithSslAgentWiki();
        java.lang.System.out.println("----3 ---");
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        java.lang.System.out.println(("Haling test: " + (e.getMessage())));
    }
}