@java.lang.Override
public java.lang.String getErrorMessage() {
    java.lang.String message = "";
    if ((this.exception) != null) {
        message = this.exception.getMessage();
    }
    return message;
}