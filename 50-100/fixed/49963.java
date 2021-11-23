@java.lang.Override
public void getCards(final com.codelab.ocrexample.searchactiviy.DataRetrieveListener retrieveListener) {
    com.raizlabs.android.dbflow.sql.language.SQLite.select().from(com.codelab.ocrexample.data.model.Card.class).async().queryListResultCallback(new com.raizlabs.android.dbflow.structure.database.transaction.QueryTransaction.QueryResultListCallback<com.codelab.ocrexample.data.model.Card>() {
        @java.lang.Override
        public void onListQueryResult(com.raizlabs.android.dbflow.structure.database.transaction.QueryTransaction transaction, @android.support.annotation.NonNull
        List<com.codelab.ocrexample.data.model.Card> tResult) {
            retrieveListener.onSuccess(tResult);
        }
    }).execute();
}