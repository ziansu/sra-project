@java.lang.SuppressWarnings(value = { "unchecked" , "ConstantConditions" })
public B setStart(java.util.Date start) {
    com.google.common.base.Preconditions.checkNotNull(start, "start cannot be null");
    com.google.common.base.Preconditions.checkArgument(((startRelative) == null), "Both relative and absolute start times cannot be set.");
    this.startAbsolute = start.getTime();
    return ((B) (this));
}