public void refresh(java.lang.String rateLimiterYaml) {
    org.springframework.beans.factory.config.YamlPropertiesFactoryBean yaml = new org.springframework.beans.factory.config.YamlPropertiesFactoryBean();
    yaml.setResources(new org.springframework.core.io.FileSystemResource(rateLimiterYaml));
    rateLimiterProperties = yaml.getObject();
    this.time_frame = ((int) (rateLimiterProperties.get("time-frame"))) * 1000;
    clear();
}