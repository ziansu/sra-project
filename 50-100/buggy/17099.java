public boolean take(buildcraft.api.robots.EntityRobotBase robot) {
    if ((robotTaking) == null) {
        buildcraft.api.robots.IRobotWorldRegistry registry = RobotManager.registryProvider.getRegistry(world);
        linkIsMain = false;
        robotTaking = robot;
        robotTakingId = robot.getRobotId();
        registry.registryMarkDirty();
        registry.take(this, robot.getRobotId());
        return true;
    }else {
        return (robot.getRobotId()) == (robotTakingId);
    }
}