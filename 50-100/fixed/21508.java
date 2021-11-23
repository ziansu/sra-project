public void selectAll() {
    if ((mChapterCbChecked.size()) != (mComicChapterList.size())) {
        mComicChapterList.clear();
        for (int i = 0; i < (mComicChapterList.size()); i++) {
            mChapterCbChecked.add(i);
        }
    }else {
        mChapterCbChecked.clear();
    }
    notifyDataSetChanged();
}