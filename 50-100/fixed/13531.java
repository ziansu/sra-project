@java.lang.Override
public cn.lemon.view.adapter.BaseViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    if (viewType == (cn.lemon.view.adapter.RecyclerAdapter.HEADER_TYPE)) {
        return new cn.lemon.view.adapter.BaseViewHolder(headerView);
    }else
        if (viewType == (cn.lemon.view.adapter.RecyclerAdapter.FOOTER_TYPE)) {
            return new cn.lemon.view.adapter.BaseViewHolder(footerView);
        }else
            if (viewType == (cn.lemon.view.adapter.RecyclerAdapter.STATUS_TYPE)) {
                return new cn.lemon.view.adapter.BaseViewHolder(mStatusView);
            }else
                return onCreateBaseViewHolder(parent, viewType);
            
        
    
}