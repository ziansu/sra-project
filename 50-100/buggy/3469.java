protected void onItemChecked(android.view.View v, boolean isChecked) {
    if (v instanceof android.widget.Checkable) {
        onCheckboxItemChecked(v, isChecked);
    }else
        if (v instanceof android.widget.RadioButton) {
            onRadioButtonItemChecked(((android.widget.RadioButton) (v)), isChecked);
        }
    
    com.frostwire.android.gui.views.AbstractListAdapter.notifyDataSetInvalidated();
    if ((onItemCheckedListener) != null) {
        onItemCheckedListener.onItemChecked(v, ((T) (v.getTag())), isChecked);
    }
}