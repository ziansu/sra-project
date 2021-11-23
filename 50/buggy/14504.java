@java.lang.Override
public int getItemCount() {
    if ((mData) != null) {
        return mData.size();
    }else {
        return 0;
    }
}