@java.lang.Override
public boolean onItemClick(android.view.View view, int position) {
    if (((mDatas) == null) || (position >= (mDatas.size()))) {
        return false;
    }
    android.content.Intent intent = new android.content.Intent(getActivity(), com.zhenghaiqiang.longman.activity.WordListActivity.class);
    intent.putExtra("words", mDatas);
    intent.putExtra("position", position);
    startActivity(intent);
    return false;
}