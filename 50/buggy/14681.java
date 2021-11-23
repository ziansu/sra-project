@java.lang.Override
public android.view.View initView() {
    android.view.View root = android.view.View.inflate(mainActivity, R.layout.fragment_content_view, null);
    com.lidroid.xutils.ViewUtils.inject(root);
    return root;
}