@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, com.workangel.tech.test.View view, int position, long id) {
    com.workangel.tech.test.database.bean.Employee employee = ((com.workangel.tech.test.database.bean.Employee) (parent.getItemAtPosition(position)));
    de.greenrobot.event.EventBus.getDefault().post(new com.workangel.tech.test.MainActivity.EventTransactToEmployeeDetailFragment(employee));
}