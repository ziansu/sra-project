@java.lang.Override
public void onClickSwitch(boolean switchToPanel) {
    if (switchToPanel) {
        mEmotionsEditText.clearFocus();
    }else {
        mEmotionsEditText.requestFocus();
    }
}