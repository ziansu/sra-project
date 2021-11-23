protected java.lang.String getBundleJarPath() throws ru.yandex.qatools.allure.command.AllureCommandException {
    java.nio.file.Path path = ru.yandex.qatools.allure.command.PROPERTIES.getAllureHome().resolve("app/allure-bundle.jar").toAbsolutePath();
    if (java.nio.file.Files.notExists(path)) {
        throw new ru.yandex.qatools.allure.command.AllureCommandException(ru.yandex.qatools.allure.logging.Message.COMMAND_REPORT_GENERATE_BUNDLE_MISSING, path);
    }
    return path.toString();
}