@java.lang.Override
public boolean performLongClick() {
    if ((mLongListener) != null) {
        return mLongListener.onLongClick(this);
    }
    return false;
}