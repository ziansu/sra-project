@java.lang.Override
public void set(us.ihmc.humanoidRobotics.communication.packets.walking.GoHomeMessage message) {
    clear();
    executionDelayTime = message.executionDelayTime;
    trajectoryTime = message.getTrajectoryTime();
    us.ihmc.humanoidRobotics.communication.packets.walking.GoHomeMessage.BodyPart bodyPart = message.getBodyPart();
    if (bodyPart.isRobotSideNeeded()) {
        us.ihmc.robotics.robotSide.RobotSide robotSide = message.getRobotSide();
        sideDependentBodyPartRequestMap.get(robotSide).get(bodyPart).setTrue();
    }else {
        otherBodyPartRequestMap.get(bodyPart).setTrue();
    }
}