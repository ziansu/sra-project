@java.lang.Override
public java.lang.String toScript() {
    return java.lang.String.format("jQuery(function() { %s = new kendo.data.DataSource(%s); });", this.getName(), this.build());
}