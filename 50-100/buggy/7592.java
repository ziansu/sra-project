@java.lang.Override
void appendOp(java.lang.String op, boolean binOp) {
    if (((getLastChar()) != ' ') && ((op.charAt(0)) != ',')) {
        append(" ");
    }
    append(op);
    if (binOp) {
        append(" ");
    }
}