@java.lang.Override
public boolean isConnectionHealthy() {
    if ((lastPacket) != null) {
        return ((edu.wpi.first.wpilibj.Timer.getFPGATimestamp()) - (lastPacket.getRecieptTimestamp())) <= (healthyTimeThreshold);
    }
    return false;
}