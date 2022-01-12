@java.lang.Override
public void onClick(android.view.View view) {
    realmvsorma.ablack13.com.realmvsormasample.App.realm().executeTransaction(new io.realm.Realm.Transaction() {
        @java.lang.Override
        public void execute(io.realm.Realm realm) {
            final realmvsorma.ablack13.com.realmvsormasample.beans.OrmaBeanObj obj = new realmvsorma.ablack13.com.realmvsormasample.beans.OrmaBeanObj();
            obj.name = "New orma item" + (java.lang.System.currentTimeMillis());
            realmvsorma.ablack13.com.realmvsormasample.App.orma().transactionSync(new java.lang.Runnable() {
                @java.lang.Override
                public void run() {
                    realmvsorma.ablack13.com.realmvsormasample.App.orma().relationOfOrmaBeanObj().inserter().execute(obj);
                }
            });
        }
    });
}