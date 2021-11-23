public Model.Transaction addTransaction(Model.Transaction trans) {
    Model.CategoryModel CModel = Model.CategoryModel.GetInstance();
    CModel.AddTransactionIDToCategoryAndUpdateDatabase(trans.getmCategoryId(), trans.getmTransactionId(), trans.getmAmount());
    WriteNewTransaction(trans);
    mTransactions.put(trans.getmTransactionId(), trans);
    return trans;
}