@java.lang.Override
public int getUnreadCount(final com.vaguehope.onosendai.config.Column column, final boolean excludeRetweets) {
    return this.dbAdaptor.getUnreadCount(column, excludeRetweets);
}