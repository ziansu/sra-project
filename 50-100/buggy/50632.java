@java.lang.Override
public java.lang.String asString() {
    if ((period.getValue()) == 1) {
        return (expression.asString()) != null ? "*" : "";
    }
    return java.lang.String.format("%s/%s", this.expression.asString(), getPeriod());
}