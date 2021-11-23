public boolean isExpired() {
    return (java.lang.System.currentTimeMillis()) > ((time.getTime()) + (net.sourceforge.subsonic.domain.PlayStatus.TTL_MILLIS));
}