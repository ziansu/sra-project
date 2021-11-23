public void onDateSet(android.widget.DatePicker view, int year, int month, int day) {
    israelbgf.gastei.mobile.actvities.ExpenseManagementActivity activity = getExpenseManagementActivity();
    activity.chosenYear = year;
    activity.chosenMonth = month + 1;
    activity.listMonthlyExpenses();
    android.widget.TextView monthView = ((android.widget.TextView) (getActivity().findViewById(R.id.date_picker_button)));
    monthView.setText(israelbgf.gastei.mobile.actvities.ExpenseManagementActivity.DatePickerFragment.getFormattedDate(activity.chosenYear, activity.chosenMonth));
}