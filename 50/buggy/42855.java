@java.lang.Override
public int moveToNext(int position) {
    return set.nextSetBit((position + 1));
}