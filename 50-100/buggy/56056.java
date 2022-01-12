@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (isChecked) {
        activityString.setCharAt(2, '1');
        mAssign.setLogs(activityString.toString());
    }else {
        activityString.setCharAt(2, '0');
        mAssign.setLogs(activityString.toString());
    }
    android.widget.Toast toast = android.widget.Toast.makeText(getActivity(), mAssign.getLogs(), Toast.LENGTH_SHORT);
    toast.show();
}