@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.accept :
            leave.setLeaveStatus(1);
            mDatabase.child(java.lang.String.valueOf(leave.getId())).setValue(leave);
            finish();
            break;
        case R.id.reject :
            leave.setLeaveStatus(2);
            mDatabase.child(java.lang.String.valueOf(leave.getId())).setValue(leave);
            finish();
            break;
    }
}