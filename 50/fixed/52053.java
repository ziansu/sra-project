android.util.Pair<java.util.List<net.oneread.aghanim.components.utility.IRecyclerItem>, java.lang.String> getHistory(int index) {
    if (index < (this.mPageHistory.size())) {
        return this.mPageHistory.get(index);
    }else {
        return null;
    }
}