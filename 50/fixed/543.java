@java.lang.Override
public boolean hasNext() {
    return ((base) != null) && ((base.compareTo(last)) <= 0);
}