private void confirm() {
    android.content.Intent intent = new android.content.Intent();
    mSearchInfos[3] = mSearchInput.getText().toString();
    if (((mSearchInfos[2]) == null) || (mSearchInfos[2].equals("请选择"))) {
        mSearchInfos[2] = "";
    }
    intent.putExtra(cn.boweikeji.wuliu.supplyer.activity.SearchActivity.KEY_RESULT, mSearchInfos);
    setResult(cn.boweikeji.wuliu.supplyer.activity.RESULT_OK, intent);
    finish();
}