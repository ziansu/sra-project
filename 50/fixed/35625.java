@java.lang.Override
public int getRank() {
    return (next) != null ? next.rank : -1;
}