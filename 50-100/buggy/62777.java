@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    com.example.nguyennam.financialbook.recordtab.ExpenseFormInput expenseFormInput = new com.example.nguyennam.financialbook.recordtab.ExpenseFormInput();
    com.example.nguyennam.financialbook.recordtab.IncomeFormInput incomeFormInput = new com.example.nguyennam.financialbook.recordtab.IncomeFormInput();
    com.example.nguyennam.financialbook.recordtab.TransferFormInput transferFormInput = new com.example.nguyennam.financialbook.recordtab.TransferFormInput();
    switch (position) {
        case 0 :
            insertNestedFragment(expenseFormInput);
            break;
        case 1 :
            insertNestedFragment(incomeFormInput);
            break;
        case 2 :
            insertNestedFragment(transferFormInput);
            break;
    }
}