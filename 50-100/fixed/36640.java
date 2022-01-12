@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.TableRow selectedTableRow = ((android.widget.TableRow) (v));
    java.lang.Integer rowNumber = ((java.lang.Integer) (selectedTableRow.getTag()));
    java.lang.String selectedEmployee = schedulesForEmployee.get(rowNumber);
    updateDefaultEmployee(selectedEmployee, false);
    mListener.onChangeFragment(AvailableFragments.ShowSchedules);
}