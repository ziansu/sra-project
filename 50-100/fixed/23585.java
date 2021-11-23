@java.lang.Override
public com.supersuperstar.android.shopapi.ProductAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    mContext = parent.getContext();
    android.widget.RelativeLayout v = ((android.widget.RelativeLayout) (android.view.LayoutInflater.from(mContext).inflate(R.layout.product_item, parent, false)));
    return new com.supersuperstar.android.shopapi.ProductAdapter.ViewHolder(v);
}