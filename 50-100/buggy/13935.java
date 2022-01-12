@java.lang.Override
public void onClick(android.view.View v) {
    if (mChapterCbChecked.contains(position)) {
        mChapterCbChecked.remove(position);
        holder.cb.setChecked(false);
    }else {
        mChapterCbChecked.add(position);
        holder.cb.setChecked(true);
    }
    isAllSelected();
}