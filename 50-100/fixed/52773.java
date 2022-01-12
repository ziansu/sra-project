@org.junit.Test
public void testPTemplate() {
    java.util.Properties properties = new java.util.Properties();
    properties.put("asdf.fdsa", "foobar");
    properties.put("user.name", java.lang.System.getProperty("user.name"));
    com.utilsplus.io.template.PTemplate testTemplate = new com.utilsplus.io.template.PTemplate("fdsa \\${asdf.fdsa} asdf ${asdf.fdsa} test ${user.name} fdsa", properties);
    org.fest.assertions.Assertions.assertThat(testTemplate.resolve()).isEqualTo((("fdsa ${asdf.fdsa} asdf foobar test " + (java.lang.System.getProperty("user.name"))) + " fdsa"));
}