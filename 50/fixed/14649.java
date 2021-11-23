@java.lang.Override
public boolean isOpen(int i, int j) {
    i = validateInput(i);
    j = validateInput(j);
    return isOpen(getKey(i, j));
}