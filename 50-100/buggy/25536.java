private void initListIncome(int month) {
    java.lang.String[] arrayIncomes = callback.getIncomes(month);
    java.util.ArrayList<java.lang.String> incomeList = new java.util.ArrayList<>();
    java.util.Collections.addAll(incomeList, arrayIncomes);
    android.widget.ArrayAdapter<java.lang.String> adapterIncome = new android.widget.ArrayAdapter<java.lang.String>(getActivity(), android.R.layout.simple_list_item_1, arrayIncomes);
    listIncomes.setAdapter(adapterIncome);
    listIncomes.setOnItemClickListener(new com.example.i7.jobbalagom.fragments.BudgetFragment.IncomeListener());
}