public static void main(final java.lang.String[] args) {
    final org.springframework.context.support.ClassPathXmlApplicationContext applicationContext = new org.springframework.context.support.ClassPathXmlApplicationContext("/uk/nhs/ciao/docs/parser/kings/beans.xml");
    try {
        if ((args.length) < 2) {
            uk.nhs.ciao.docs.parser.kings.KingsDischargeSummaryParser.runGuiApp(applicationContext);
        }else {
            uk.nhs.ciao.docs.parser.kings.KingsDischargeSummaryParser.runConsoleApp(applicationContext, args);
        }
    } catch (java.lang.Throwable e) {
        uk.nhs.ciao.docs.parser.kings.KingsDischargeSummaryParser.LOGGER.error("Exception while running parser", e);
        java.lang.System.exit((-1));
    } finally {
        applicationContext.close();
    }
}