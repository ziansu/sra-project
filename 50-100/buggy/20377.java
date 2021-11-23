private void endableState(int index) {
    if ((index <= 0) && (index < (mReadWordExpandAdapter.getWordInfos().size()))) {
        return ;
    }
    resetPlay();
    mReadWordExpandAdapter.setViewPlayState(index, mWordListView, true);
    mReadWordExpandAdapter.getWordInfos().get(index).setPlay(true);
    setProgressNum(((currentIndex) + 1), mDatas.size());
    mWordListView.smoothScrollToPosition(index);
}