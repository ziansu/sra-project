@java.lang.Override
public void setConfigurationContext(org.apache.tamaya.spi.ConfigurationContext context) {
    org.apache.tamaya.Configuration oldConfig = this.config;
    org.apache.tamaya.Configuration newConfig = new org.apache.tamaya.core.internal.DefaultConfiguration(context);
    this.config = newConfig;
}