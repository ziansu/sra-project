@java.lang.SuppressWarnings(value = "deprecation")
private static java.util.List<java.lang.String> getSlaveNames() {
    hudson.model.ComputerSet computers = jenkins.model.Jenkins.getInstance().getComputer();
    java.util.List<java.lang.String> slaveNames = computers.get_slaveNames();
    java.util.List<java.lang.String> test = new java.util.ArrayList<java.lang.String>();
    test.addAll(slaveNames);
    if (!(test.contains(org.jenkins_ci.plugins.run_condition.core.NodeCondition.MASTER))) {
        test.add(0, org.jenkins_ci.plugins.run_condition.core.NodeCondition.MASTER);
    }
    return test;
}