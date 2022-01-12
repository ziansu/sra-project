@java.lang.Override
public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    if (viewType == (com.project.gu.testnestedscrollingfirst.content.sinaweibo.RefreshAdapter.HEADERTYPE)) {
        return new com.project.gu.testnestedscrollingfirst.content.sinaweibo.RefreshAdapter.Holder(rv.getRefreshHeader());
    }else
        if (viewType == (com.project.gu.testnestedscrollingfirst.content.sinaweibo.RefreshAdapter.ITEMTYPE)) {
            return new com.project.gu.testnestedscrollingfirst.content.sinaweibo.RefreshAdapter.Holder(android.view.LayoutInflater.from(mContext).inflate(R.layout.rv_item, parent, false));
        }
    
    return null;
}