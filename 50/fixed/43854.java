public quality.gates.jenkins.plugin.GlobalConfigDataForSonarInstance validateData(quality.gates.jenkins.plugin.GlobalConfigDataForSonarInstance globalConfigDataForSonarInstance) {
    return new quality.gates.jenkins.plugin.GlobalConfigDataForSonarInstance(globalConfigDataForSonarInstance.getName(), validateUrl(globalConfigDataForSonarInstance), validateUsername(globalConfigDataForSonarInstance), validatePassword(globalConfigDataForSonarInstance));
}