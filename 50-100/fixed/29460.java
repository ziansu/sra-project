@java.lang.Override
public int getItemCount() {
    int count = 0;
    if ((mMiscSections) != null) {
        count = mMiscSections.size();
    }
    for (int i = 0; i < (mSections.size()); i++) {
        count += mSections.get(i).getItemCount();
    }
    return count;
}