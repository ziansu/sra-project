@java.lang.Override
public double getDesiredPositionY(double timeInSeconds) {
    final double currentTime = getRelativeTime(timeInSeconds);
    refreshCache(currentTime);
    return transformToRealPosition(getCachePoint()).getY();
}