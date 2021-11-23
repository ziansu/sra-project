@java.lang.Override
protected void setViewMode(com.wilsongateway.Framework.Tables.Ticket t) {
    if (t != null) {
        viewMode = Mode.VIEW;
    }else {
        viewMode = Mode.ADD;
    }
}