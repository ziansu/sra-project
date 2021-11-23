@java.lang.Override
public int getItemViewType(int position) {
    log(("getItemViewType --- position : " + position));
    if ((hasHeader) && (position == 0)) {
        return cn.lemon.view.adapter.RecyclerAdapter.HEADER_TYPE;
    }
    if ((hasFooter) && (position == ((mViewCount) - 2))) {
        return cn.lemon.view.adapter.RecyclerAdapter.FOOTER_TYPE;
    }
    if (position == ((mViewCount) - 1)) {
        return cn.lemon.view.adapter.RecyclerAdapter.STATUS_TYPE;
    }
    return super.getItemViewType(position);
}