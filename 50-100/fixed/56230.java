@java.lang.Override
public void onClick(android.view.View v) {
    if (saveData()) {
        com.appers.ayvaz.thetravelingsalesman.models.ExpenseContent expenseContent = com.appers.ayvaz.thetravelingsalesman.models.ExpenseContent.get(getApplicationContext());
        showPhoto(expenseContent.getPhotoFile(expense_main, false), expenseContent.getPhotoFile(expense_main, true), false);
    }
}