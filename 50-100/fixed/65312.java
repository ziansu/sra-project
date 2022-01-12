public boolean WriteCategoryAndUpdateDatabase(Model.Category cat) {
    if (CheckNameUsed(cat.getmName()))
        return false;
    
    java.lang.Long key = java.lang.System.currentTimeMillis();
    cat.setmID(key);
    AddCategory(cat);
    mDatabase.child(key.toString()).setValue(cat);
    Model.BudgetModel.GetInstance().CategoryAdded(cat.getmBudgetID(), cat.getmID());
    return true;
}