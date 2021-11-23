private edu.illinois.nondex.common.Configuration debugWithConfigurations(java.util.Set<edu.illinois.nondex.common.Configuration> failingConfigurations) {
    edu.illinois.nondex.common.Configuration debConfig = null;
    for (edu.illinois.nondex.common.Configuration config : failingConfigurations) {
        if (this.failsOnDry(config)) {
            edu.illinois.nondex.common.Configuration failingConfig = this.startDebugBinary(config);
            if (failingConfig.hasLessChoicePoints(debConfig)) {
                debConfig = failingConfig;
            }
        }
    }
    return debConfig;
}