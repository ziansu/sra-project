public org.springframework.core.env.PropertySource<?> loadConfiguration() {
    return this.configurationLoader.load();
}