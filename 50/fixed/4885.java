@java.lang.Override
public java.lang.String getErrorMessage() {
    java.lang.String message = "";
    if (null != (this.exception)) {
        message = this.exception.getMessage();
    }
    return message;
}