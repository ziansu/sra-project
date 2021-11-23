public boolean takeAsMain(buildcraft.api.robots.EntityRobotBase robot) {
    if ((robotTakingId) == (EntityRobotBase.NULL_ROBOT_ID)) {
        buildcraft.api.robots.IRobotWorldRegistry registry = RobotManager.registryProvider.getRegistry(world);
        linkIsMain = true;
        robotTaking = robot;
        robotTakingId = robot.getRobotId();
        registry.registryMarkDirty();
        robot.setMainStation(this);
        return true;
    }else {
        return (robotTakingId) == (robot.getRobotId());
    }
}