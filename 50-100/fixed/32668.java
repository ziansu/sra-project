@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.accept :
            leave.setLeaveStatus(1);
            break;
        case R.id.reject :
            leave.setLeaveStatus(2);
            break;
    }
    mDatabase.child(java.lang.String.valueOf(leave.getId())).setValue(leave);
    finish();
}