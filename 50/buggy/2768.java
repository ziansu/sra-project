@java.lang.Override
public java.lang.String getMessage() {
    return java.lang.String.format("%s: %s", this.getMessage(), this.getCause().getMessage());
}