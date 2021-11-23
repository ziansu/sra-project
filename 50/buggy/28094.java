@java.lang.Override
public void resume() {
    sendPacketToController(new us.ihmc.humanoidRobotics.communication.packets.walking.PauseWalkingMessage(false));
    detectBall = true;
}