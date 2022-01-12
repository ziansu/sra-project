@org.junit.Test
public void jsonFormatCanBeFoundViaServiceLoader() throws java.lang.Exception {
    java.util.List<org.apache.tamaya.format.ConfigurationFormat> formats = org.apache.tamaya.spi.ServiceContextManager.getServiceContext().getServices(org.apache.tamaya.format.ConfigurationFormat.class);
    org.apache.tamaya.format.ConfigurationFormat format = null;
    for (org.apache.tamaya.format.ConfigurationFormat f : formats) {
        if (format instanceof org.apache.tamaya.json.JSONFormat) {
            format = f;
            break;
        }
    }
    org.hamcrest.MatcherAssert.assertThat(format, org.hamcrest.Matchers.notNullValue());
    org.hamcrest.MatcherAssert.assertThat(format, org.hamcrest.Matchers.instanceOf(org.apache.tamaya.json.JSONFormat.class));
}