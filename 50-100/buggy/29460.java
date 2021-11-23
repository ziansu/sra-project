@java.lang.Override
public int getItemCount() {
    int count = 0;
    if ((mMiscSections) != null) {
        count = mMiscSections.size();
    }
    return ((mSections.lastKey()) + (mSections.lastEntry().getValue().getItemCount())) + count;
}