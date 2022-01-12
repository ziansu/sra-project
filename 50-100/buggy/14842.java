@java.lang.Override
public void done(java.util.List<com.example.dm.myapplication.beans.NotesBean> list, cn.bmob.v3.exception.BmobException e) {
    if (!(list.isEmpty())) {
        for (com.example.dm.myapplication.beans.NotesBean notesBean : list) {
            mDatas.add(notesBean);
        }
        if (!(mDatas.isEmpty())) {
            mMaterialDialog.dismiss();
            mFindNotesAdapter.notifyDataSetChanged();
        }
    }else {
        android.widget.Toast.makeText(this, "暂无数据", Toast.LENGTH_SHORT).show();
    }
}