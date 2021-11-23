@java.lang.Override
public void setTitle(int titleId) {
    try {
        mTitleText.setText(titleId);
    } catch (java.lang.NullPointerException e) {
        super.setTitle(titleId);
    }
}