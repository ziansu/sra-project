@java.lang.Override
public boolean onLongClick(android.view.View v) {
    mPresenter.copy(mAskAdapter.getItem(((int) (v.getTag(R.id.tag_position)))));
    return true;
}