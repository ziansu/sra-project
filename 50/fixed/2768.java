@java.lang.Override
public java.lang.String getMessage() {
    return java.lang.String.format("%s: %s", super.getMessage(), this.getCause().getMessage());
}