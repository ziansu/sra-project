@java.lang.Override
public void onClick(android.view.View v) {
    mIsClick = true;
    int pos = ((int) (v.getTag()));
    setCurrentItem(pos);
}