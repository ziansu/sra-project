@java.lang.Override
public int getItemCount() {
    if (mLoadMoreEnable) {
        return (data.size()) + 1;
    }
    return data.size();
}