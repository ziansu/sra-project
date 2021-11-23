@java.lang.Override
public void onClick(android.view.View v) {
    mBinding.addTabV.show();
    mBinding.fab.hide();
    mBinding.addTabOpLl.setVisibility(View.VISIBLE);
    mBinding.newTabLabelTv.setText("");
    mBinding.newTabLabelTv.setVisibility(View.VISIBLE);
}