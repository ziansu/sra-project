@java.lang.Override
protected us.ihmc.darpaRoboticsChallenge.drcRobot.DRCRobotModel getRobotModel(int xContactPoints, int yContactPoints, boolean createOnlyEdgePoints) {
    robotModel.addMoreFootContactPointsSimOnly(16, 8, createOnlyEdgePoints);
    return robotModel;
}