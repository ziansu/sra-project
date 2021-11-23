public void addTag(com.thoughtworks.lean.sonar.aggreagtedreport.model.TestType testType) {
    this.details.put(testType, com.google.common.collect.Lists.<com.thoughtworks.lean.sonar.aggreagtedreport.model.TestScenarioDto>newArrayList());
}