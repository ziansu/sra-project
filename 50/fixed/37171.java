@java.lang.Override
public void save() {
    executeTransaction(new com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction.Builder<>(new com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction.ProcessModel<com.raizlabs.android.dbflow.structure.TModel>() {
        @java.lang.Override
        public void processModel(com.raizlabs.android.dbflow.structure.TModel model) {
            model.save();
        }
    }).add(model).build());
}