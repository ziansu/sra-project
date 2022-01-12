@java.lang.Override
public int getItemCount() {
    if ((mList) == null) {
        return 0;
    }
    if ((mPage) == (mLastPage)) {
        return (mList.size()) % (animalize.github.com.quantangshi.ListViewPack.TagSearchRVAdapter.PAGEITEMS);
    }else {
        return animalize.github.com.quantangshi.ListViewPack.TagSearchRVAdapter.PAGEITEMS;
    }
}