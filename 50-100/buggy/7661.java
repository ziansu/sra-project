public static void main(java.lang.String... args) {
    org.apache.tamaya.builder.ConfigurationBuilder builder = new org.apache.tamaya.builder.ConfigurationBuilder();
    org.apache.tamaya.Configuration config = builder.addPropertySources(org.apache.tamaya.resource.ConfigResources.getResourceResolver().getResources("META-INF/boot/*.ini")).addPropertySources(org.apache.tamaya.resource.ConfigResources.getResourceResolver().getResources("META-INF/config/*.properties")).enableProvidedPropertyConverters().enabledProvidedPropertyFilters().build();
}