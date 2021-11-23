protected void checkAddIncludePath() {
    com.jetbrains.php.config.PhpProjectConfigurationFacade facade = com.jetbrains.php.config.PhpProjectConfigurationFacade.getInstance(this.project);
    java.util.List<java.lang.String> includePaths = facade.getIncludePath();
    java.lang.String completionIncludePath = completions.getIncludePath();
    if (includePaths.contains(completionIncludePath)) {
        includePaths.remove(completionIncludePath);
        facade.setIncludePath(includePaths);
    }
    includePaths.add(completionIncludePath);
    facade.setIncludePath(includePaths);
}