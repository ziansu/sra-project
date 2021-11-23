@butterknife.OnClick(value = R.id.music_search_btn)
public void onSearch() {
    xyf.com.appframe.recycleviewtools.SoftInputUtils.hideSoftInput(this);
    adapter.clear();
    xyf.com.appframe.MusicSearchActivity.pageno = 1;
    xyf.com.appframe.recycleviewtools.ProgressDialogUtils.showProgress(this);
    xyf.com.appframe.MusicSearchActivity.searchkey = input.getText().toString().trim();
    setTitle(xyf.com.appframe.MusicSearchActivity.searchkey);
    load(xyf.com.appframe.MusicSearchActivity.searchkey, ("" + (xyf.com.appframe.MusicSearchActivity.pageno)));
}