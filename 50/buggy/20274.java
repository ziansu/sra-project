@java.lang.Override
public void onRefreshBegin(in.srain.cube.views.ptr.PtrFrameLayout frame) {
    getData();
    android.widget.Toast.makeText(getActivity(), "下拉刷新", Toast.LENGTH_SHORT).show();
    mPtrFrame.refreshComplete();
}