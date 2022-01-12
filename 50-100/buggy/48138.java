@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, com.workangel.tech.test.View view, int position, long id) {
    com.workangel.tech.test.hierarchy.Node employeeNode = ((com.workangel.tech.test.hierarchy.Node) (parent.getItemAtPosition(position)));
    com.workangel.tech.test.database.bean.Employee employee = employeeNode.getData();
    de.greenrobot.event.EventBus.getDefault().post(new com.workangel.tech.test.MainActivity.EventTransactToEmployeeDetailFragment(employee, employeeNode));
}