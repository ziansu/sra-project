@java.lang.Override
public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder holder, int position) {
    com.lidroid.xutils.util.LogUtils.d("ZhihuAdapter#onBindViewHolder");
    int type = getItemViewType(position);
    switch (type) {
        case com.tcl.openmind.adapter.ZhihuAdapter.NOMAL_ITEM :
            bindViewHolderNormal(((com.tcl.openmind.adapter.ZhihuAdapter.ZhihuViewHolder) (holder)), position);
            break;
        case com.tcl.openmind.adapter.ZhihuAdapter.TYPE_LOADING_MORE :
            bindLoadingViewHolder(((com.tcl.openmind.adapter.ZhihuAdapter.LoadingMoreHolder) (holder)), position);
            break;
    }
}