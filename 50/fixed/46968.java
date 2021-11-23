@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    checkedItems[((int) (buttonView.getTag()))] = isChecked;
    activity.onItemSelected();
}