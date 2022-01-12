@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    varun.com.studentmanagementsystemsample.bean.UserTypeBean userTypeBean = ((varun.com.studentmanagementsystemsample.bean.UserTypeBean) (parent.getItemAtPosition(position)));
    if (userTypeIDStr.equalsIgnoreCase("1")) {
        reportedByStaffIDStr = userTypeBean.getId();
    }else
        if (userTypeIDStr.equalsIgnoreCase("2")) {
        }
    
    incident_reporting_by.setText(userTypeBean.getValue());
}