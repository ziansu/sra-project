@java.lang.Override
public boolean onLongClick(android.view.View view) {
    index.add(position);
    if ((index.size()) == (com.vtewari.bunkconfidently.adapter.LectureListAdapter.list.size())) {
        return true;
    }else {
        return true;
    }
}