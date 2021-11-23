public void onClick(android.content.DialogInterface dialog, int i) {
    if (canEdit) {
        claimController.removeExpense(claimController.getExpense(position));
        mapper.saveClaimData(claimId, "expenses", claimController.getExpenseList());
        update();
        setViews();
    }else {
        android.widget.Toast.makeText(getApplicationContext(), ((claimController.getStatus()) + " claims can not be edited."), Toast.LENGTH_SHORT).show();
    }
}