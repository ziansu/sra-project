@java.lang.Override
public java.lang.String toScript() {
    return java.lang.String.format("jQuery(function() { %s = new kendo.data.SchedulerDataSource(%s); });", this.getName(), this.toString());
}