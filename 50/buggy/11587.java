@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    com.yydcdut.note.utils.ActivityCollector.removeActivity(this);
    mIPresenter.detachView();
}