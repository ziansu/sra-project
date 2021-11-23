@java.lang.Override
public java.lang.String toString() {
    if ((this.timestampStr) == null) {
        this.timestampStr = (((((this.getClass().getName()) + ":[") + (this.timestamp)) + '|') + (new java.util.Date(this.timestamp))) + ']';
    }
    return this.timestampStr;
}