@java.lang.Override
public int getGapCount() {
    if (isClosed()) {
        return 0;
    }else {
        return 1;
    }
}