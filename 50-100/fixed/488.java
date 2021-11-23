@java.lang.Override
public void onBindViewHolder(com.brunocascio.expensis.ExpenseAdapter.ExpenseViewHolder viewHolder, int i) {
    com.brunocascio.expensis.Expense e = data.get(i);
    viewHolder.description.setText(e.getDescription());
    viewHolder.amount.setText((("$" + (e.getAmount())) + ""));
    viewHolder.date.setText(e.getFullDateWithOutYear());
}