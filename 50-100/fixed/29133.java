@java.lang.Override
public java.lang.String toString() {
    return ((((("BLangVariable: " + (this.getFlags().contains(Flag.CONST) ? "const " : "")) + ((this.name) != null ? this.name : "")) + "[") + (this.type)) + "]") + ((this.expr) != null ? " = " + (this.expr) : "");
}