@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    cn.alien95.util.Utils.Log("fragment onCreate");
    getActivity().setTitle("吃货");
    adapter = new cn.zhou.foodie.module.adapter.CommodityAdapter(java.security.AccessController.getContext());
}