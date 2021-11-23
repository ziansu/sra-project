protected java.nio.file.Path getConfigPath() {
    return ru.yandex.qatools.allure.command.PROPERTIES.getAllureConfig().toAbsolutePath().getParent();
}