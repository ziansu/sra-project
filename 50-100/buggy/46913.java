public void setData(java.lang.Object c, final android.content.Context context, java.lang.String eid) {
    if (!(c instanceof it.polito.group05.group05.Utility.BaseClasses.ExpenseDatabase))
        return ;
    
    final it.polito.group05.group05.Utility.BaseClasses.Expense expenseDatabase = new it.polito.group05.group05.Utility.BaseClasses.Expense(((it.polito.group05.group05.Utility.BaseClasses.ExpenseDatabase) (c)));
    if (eid != null)
        if (eid.equals(expenseDatabase.getId()))
            setData(c, context, View.VISIBLE);
        else
            setData(c, context, View.GONE);
        
    
}