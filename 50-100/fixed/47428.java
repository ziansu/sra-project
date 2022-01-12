public ru.yandex.qatools.allure.jenkins.tools.AllureCommandlineInstallation getCommandlineInstallation(java.lang.String name) {
    java.util.List<ru.yandex.qatools.allure.jenkins.tools.AllureCommandlineInstallation> installations = ru.yandex.qatools.allure.jenkins.utils.BuildUtils.getAllureInstallations();
    ru.yandex.qatools.allure.jenkins.tools.AllureCommandlineInstallation installation = findCommandlineByName(name);
    if ((installation == null) && (!(installations.isEmpty()))) {
        return installations.get(0);
    }else {
        return installation;
    }
}