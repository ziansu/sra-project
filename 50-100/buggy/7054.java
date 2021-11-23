@java.lang.Override
public com.ckt.ckttodo.ui.ProjectActivity.ProjectAdapter.MainVH onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    int layout;
    switch (viewType) {
        case VIEW_TYPE_HEADER :
            layout = R.layout.item_persoanl_project_header;
            break;
        case VIEW_TYPE_ITEM :
            layout = R.layout.item_personal_project;
            break;
        default :
            layout = R.layout.item_personal_project;
            break;
    }
    android.view.View v = android.view.LayoutInflater.from(parent.getContext()).inflate(layout, parent, false);
    return new com.ckt.ckttodo.ui.ProjectActivity.ProjectAdapter.MainVH(v, this);
}