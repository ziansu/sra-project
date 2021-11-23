@java.lang.Override
public void onClick(android.view.View view) {
    setItemClicked(position);
    if (mSelectedIndexs.isEmpty()) {
        setRightButton("确定", mConfirmListener);
    }else {
        setRightButton((("确定(" + (mSelectedIndexs.size())) + ")"), mConfirmListener);
    }
}