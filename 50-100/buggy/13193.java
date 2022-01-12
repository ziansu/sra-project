@java.lang.Override
public void clear() {
    for (us.ihmc.humanoidRobotics.communication.packets.walking.GoHomeMessage.BodyPart bodyPart : us.ihmc.humanoidRobotics.communication.packets.walking.GoHomeMessage.BodyPart.values) {
        if (bodyPart.isRobotSideNeeded()) {
            for (us.ihmc.robotics.robotSide.RobotSide robotSide : us.ihmc.robotics.robotSide.RobotSide.values) {
                sideDependentBodyPartRequestMap.get(robotSide).get(bodyPart).setFalse();
            }
        }else {
            otherBodyPartRequestMap.get(bodyPart).setFalse();
        }
    }
}