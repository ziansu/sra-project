@java.lang.Override
public java.lang.String toString() {
    java.util.Date date = new java.util.Date(createDateMillis);
    return (date + " ") + (this.inputTextSource);
}