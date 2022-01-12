public Model.Transaction addTransaction(Model.Transaction trans) {
    WriteNewTransaction(trans);
    Model.CategoryModel CModel = Model.CategoryModel.GetInstance();
    CModel.AddTransactionIDToCategoryAndUpdateDatabase(trans.getmCategoryId(), trans.getmTransactionId(), trans.getmAmount());
    mTransactions.put(trans.getmTransactionId(), trans);
    return trans;
}