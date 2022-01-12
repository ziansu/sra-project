@java.lang.SuppressWarnings(value = { "unchecked" , "ConstantConditions" })
public B setStart(int duration, org.kairosdb.client.builder.TimeUnit unit) {
    com.google.common.base.Preconditions.checkArgument((duration > 0), "duration must be greater than 0");
    com.google.common.base.Preconditions.checkNotNull(unit, "unit cannot be null");
    com.google.common.base.Preconditions.checkArgument(((startAbsolute) == null), "Both relative and absolute start times cannot be set.");
    startRelative = new org.kairosdb.client.builder.RelativeTime(duration, unit);
    return ((B) (this));
}