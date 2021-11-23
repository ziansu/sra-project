@java.lang.Override
protected void onPostExecute(java.util.List<com.example.waniltonfilho.personaltasks.model.entities.GroupCategoryTransaction> groupTransactions) {
    mGroupCategories = groupTransactions;
    attOnline();
    dialog.dismiss();
    super.onPostExecute(groupTransactions);
}