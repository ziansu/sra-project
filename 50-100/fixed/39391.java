@java.lang.Override
public void setResult(java.util.List<com.yummyteam.fastcampus.forkit.model.Results> results) {
    elAdapter.removeallData();
    if ((results.size()) == 0) {
        android.util.Log.e("getKeyWord", "result size = 0");
        noSearch_content.setVisibility(View.VISIBLE);
    }else {
        android.util.Log.e("getKeyWord", ("size is not null" + (results.size())));
        elAdapter.addDatas(((java.util.ArrayList) (results)));
        noSearch_content.setVisibility(View.GONE);
    }
}