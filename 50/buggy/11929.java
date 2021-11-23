@java.lang.Override
public int getSpanSize(int position) {
    if (!(mAdapter.isContentView(position))) {
        return layoutManager.getSpanCount();
    }else {
        return 1;
    }
}