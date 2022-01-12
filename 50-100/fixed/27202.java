public void init() {
    android.view.View view = android.view.LayoutInflater.from(super.getContext()).inflate(R.layout.view_tab_item, this);
    tvTitle = ((android.widget.TextView) (view.findViewById(R.id.tvTitle)));
    ivIcon = ((android.widget.ImageView) (view.findViewById(R.id.ivIcon)));
    cn.ifmvo.bottomtabview.LayoutParams layoutParams = new cn.ifmvo.bottomtabview.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
    layoutParams.weight = 1;
    view.setLayoutParams(layoutParams);
    tvTitle.setText(title);
}