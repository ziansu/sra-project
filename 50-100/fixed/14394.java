private boolean isClientMode(java.util.Map<java.lang.String, java.lang.String> userProps) {
    java.lang.String userMaster = firstNonEmpty(master, userProps.get(SparkLauncher.SPARK_MASTER));
    java.lang.String userDeployMode = firstNonEmpty(deployMode, userProps.get(SparkLauncher.DEPLOY_MODE));
    return ((userMaster == null) || ("client".equals(userDeployMode))) || (userDeployMode == null);
}