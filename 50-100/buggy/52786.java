@java.lang.Override
void onChecked(int position, boolean isChecked) {
    super.onChecked(position, isChecked);
    if ((getCheckedCount()) > 0) {
        if ((activeMode) == null) {
            activeMode = startActionMode(this);
        }else {
            updateSubtitle(activeMode);
        }
    }else
        if (((getCheckedCount()) == 0) && ((activeMode) != null)) {
            activeMode.finish();
        }
    
}