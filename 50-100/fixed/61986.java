private java.lang.String formatTimestamp() {
    long now_ms = (java.lang.System.currentTimeMillis()) - (create_time);
    long now_s = now_ms / 1000;
    long now_m = now_s / 60;
    long now_h = now_m / 60;
    long ms = now_ms % 1000;
    long s = now_s % 60;
    long m = now_m % 60;
    long h = now_h % 60;
    java.lang.String t = java.lang.String.format("[%1$02d:%2$02d:%3$02d.%4$03d] ", h, m, s, ms);
    return t;
}