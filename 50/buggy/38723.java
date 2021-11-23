@java.lang.Override
public int previousIndex() {
    return hasPrevious() ? (position)-- : (position) - 1;
}