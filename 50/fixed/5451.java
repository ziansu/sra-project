@java.lang.Override
protected void onPostExecute(java.util.List<com.example.waniltonfilho.personaltasks.model.entities.GroupCategoryTransaction> groupTransactions) {
    super.onPostExecute(groupTransactions);
    mGroupCategories = groupTransactions;
    attOnline();
    dialog.dismiss();
}