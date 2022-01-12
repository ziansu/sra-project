@java.lang.Override
public int getGapCount() {
    int count = 0;
    if ((u1) == (u2)) {
        count++;
    }
    for (int j = 0; j < (parent.getGapCount()); j++) {
        float gap = parent.getGap(j);
        if (((u1) < gap) && (gap < (u2))) {
            count++;
        }
    }
    return count;
}