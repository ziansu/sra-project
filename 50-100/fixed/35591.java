public void bindDateView(int state) {
    switch (state) {
        case com.lovejjfg.zhifou.ui.recycleview.AdapterLoader.STATE_LASTED :
            contaier.setVisibility(View.VISIBLE);
            pb.setVisibility(View.GONE);
            content.setText("没有更多了！");
            break;
        case com.lovejjfg.zhifou.ui.recycleview.AdapterLoader.STATE_LOADING :
            contaier.setVisibility(View.VISIBLE);
            content.setText("加载更多！！");
            pb.setVisibility(View.VISIBLE);
            break;
    }
}