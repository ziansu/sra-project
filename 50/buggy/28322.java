private long getNowUnixTimeUs() {
    if ((elapsedRealtimeOffsetMs) != 0) {
        return ((android.os.SystemClock.elapsedRealtime()) * 1000) + (elapsedRealtimeOffsetMs);
    }else {
        return (java.lang.System.currentTimeMillis()) * 1000;
    }
}