@java.lang.Override
public void onSuccess(java.util.List<cn.zhou.foodie.data.bean.Commodity> list) {
    adapter.clear();
    cn.alien95.util.Utils.Log(("list.size : " + (list.size())));
    if (list.isEmpty()) {
        empty.setVisibility(View.VISIBLE);
        return ;
    }else {
        empty.setVisibility(View.GONE);
        adapter.addAll(list);
    }
}