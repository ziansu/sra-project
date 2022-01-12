private void onGetBaskets(java.util.List<net.nashlegend.sourcewall.model.SubItem> subItems) {
    if (isFinishing()) {
        return ;
    }
    loadingView.onLoadSuccess();
    if ((subItems == null) || ((subItems.size()) == 0)) {
        net.nashlegend.sourcewall.util.ToastUtil.toastBigSingleton("您还没有创建果篮 0.0 ");
        finish();
    }else {
        adapter.notifyDataSetChanged();
    }
}