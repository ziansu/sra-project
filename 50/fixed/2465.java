@java.lang.Override
public boolean hasNext() {
    popEmpties();
    return !(stack.isEmpty());
}