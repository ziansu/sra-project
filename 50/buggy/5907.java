@java.lang.Override
public int getCount() {
    if ((getmNumColums()) == 0) {
        return 0;
    }
    return (mPhooItem.size()) + (mNumColums);
}