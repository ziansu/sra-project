public void remove(@android.support.annotation.IdRes
int id) {
    if ((mButtons.get(id)) != null) {
        return ;
    }
    android.widget.CompoundButton button = mButtons.get(id);
    button.setOnCheckedChangeListener(null);
    button.setOnTouchListener(null);
    mButtons.remove(id);
}