@java.lang.Override
public void onClick(android.view.View v) {
    if (mChapterCbChecked.contains((position - 1))) {
        mChapterCbChecked.remove((position - 1));
    }else {
        mChapterCbChecked.add((position - 1));
    }
    isAllSelected();
}