@java.lang.Override
public java.lang.Boolean remove(java.lang.Integer ignore) {
    stack.remove(stack.get(((size()) - 1)));
    return true;
}