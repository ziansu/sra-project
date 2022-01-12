private void addDuration(hudson.plugins.robot.RobotBuildAction robotBuildAction, java.util.List<java.lang.String> columnNames, java.util.List<java.lang.Object> values) {
    columnNames.add("rf_duration");
    values.add(robotBuildAction.getResult().getDuration());
}