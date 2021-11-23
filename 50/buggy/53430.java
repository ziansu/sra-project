public static org.redisson.config.Config fromYAML(java.io.File file) throws java.io.IOException {
    org.redisson.config.ConfigSupport support = new org.redisson.config.ConfigSupport();
    return support.fromYAML(file, org.redisson.config.Config.class);
}