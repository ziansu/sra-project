public float getSpeed() {
    final long now = android.os.SystemClock.elapsedRealtime();
    final float speed = ((now - (timeStart)) != 0) ? ((float) ((bytesSent) - (lastBytesSent))) / ((float) (now - (lastProgressTime))) : 0.0F;
    lastProgressTime = now;
    lastBytesSent = bytesSent;
    return speed;
}