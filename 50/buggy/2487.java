@org.junit.Test
public void test() {
    com.axelor.tools.i18n.I18nExtractor tools = new com.axelor.tools.i18n.I18nExtractor();
    tools.extract(java.nio.file.Paths.get(com.axelor.tools.I18nExtractorTest.BASE, com.axelor.tools.I18nExtractorTest.MODULE));
}