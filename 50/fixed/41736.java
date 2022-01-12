@java.lang.Override
public int getItemCount() {
    return ((mData) == null) || ((mData.size()) == 0) ? 0 : (mData.size()) + 1;
}