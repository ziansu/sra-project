@java.lang.Override
protected us.ihmc.darpaRoboticsChallenge.drcRobot.DRCRobotModel getRobotModel(int xContactPoints, int yContactPoints, boolean createOnlyEdgePoints) {
    robotModel.addMoreFootContactPointsSimOnly(xContactPoints, yContactPoints, createOnlyEdgePoints);
    return robotModel;
}