@java.lang.Override
public double getDesiredPositionY(double timeInSeconds) {
    final double currentTime = getRelativeTime(timeInSeconds);
    refreshCache(timeInSeconds);
    return transformToRealPosition(getCachePoint()).getY();
}