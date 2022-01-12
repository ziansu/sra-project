@java.lang.Override
public byte[] simpleGet(common.bean.HtmlInfo html) throws java.lang.Exception {
    com.machinepublishers.jbrowserdriver.JBrowserDriver driver = new com.machinepublishers.jbrowserdriver.JBrowserDriver(com.machinepublishers.jbrowserdriver.Settings.builder().timezone(Timezone.ASIA_SHANGHAI).build());
    driver.get(html.getOrignUrl());
    java.lang.String htmlSource = driver.getPageSource();
    byte[] bytes = htmlSource.getBytes();
    driver.quit();
    return bytes;
}