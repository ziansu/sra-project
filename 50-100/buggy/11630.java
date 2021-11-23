private void init() {
    recyclerView = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.list)));
    recyclerView.setLayoutManager(new com.xiaofeng.flowlayoutmanager.FlowLayoutManager());
    recyclerView.setAdapter(new com.xiaofeng.androidlibs.TagAdapter(com.xiaofeng.androidlibs.DemoUtil.generate(200, 3, 13)));
}