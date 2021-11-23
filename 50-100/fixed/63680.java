public static void main(final java.lang.String[] args) throws java.lang.Exception {
    final org.springframework.context.support.ClassPathXmlApplicationContext applicationContext = new org.springframework.context.support.ClassPathXmlApplicationContext("/uk/nhs/ciao/docs/parser/kings/beans.xml");
    try {
        if ((args.length) < 2) {
            uk.nhs.ciao.docs.parser.kings.KingsDischargeSummaryParser.runGuiApp(applicationContext);
        }else {
            uk.nhs.ciao.docs.parser.kings.KingsDischargeSummaryParser.runConsoleApp(applicationContext, args);
        }
    } finally {
        applicationContext.close();
    }
}