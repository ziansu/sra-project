@java.lang.Override
public java.lang.String readString() throws javax.jms.JMSException {
    this.throwIfWriteOnlyModeBody();
    this.throwIfEOF();
    java.lang.Object obj = this.body.get(this.current_index);
    (this.current_index)++;
    return java.lang.String.valueOf(obj);
}