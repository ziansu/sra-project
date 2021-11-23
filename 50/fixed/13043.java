@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    progressBar.setVisibility(View.GONE);
    if ((expensesAndSavings) != null) {
        adapter = new com.example.rodri.letsgetout.adapter.GenericBudgetAdapter(getActivity(), 0, expensesAndSavings);
        listOfExpensesAndSavings.setAdapter(adapter);
    }
}