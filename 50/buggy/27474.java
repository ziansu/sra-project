@java.lang.Override
public void pause() {
    sendPacketToController(new us.ihmc.humanoidRobotics.communication.packets.walking.PauseWalkingMessage(true));
    detectBall = false;
}