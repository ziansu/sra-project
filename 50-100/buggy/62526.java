@java.lang.Override
public java.lang.String sql() {
    if (this.binding.isFree()) {
        throw new java.lang.IllegalStateException(((("Cannot generate " + (this)) + ".sql() for free binding ") + (this.binding)));
    }
    return this.formatter.format(getColumn(), getOperator(), addParameter(this.binding.getValues()));
}