@java.lang.Override
public void onModelStateChanged(java.lang.Class<? extends com.raizlabs.android.dbflow.structure.Model> table, com.raizlabs.android.dbflow.structure.BaseModel.Action action, com.raizlabs.android.dbflow.sql.language.SQLCondition[] primaryKeyValues) {
    if (!(this.endOfTransaction)) {
        if (((action == (BaseModel.Action.INSERT)) || (action == (BaseModel.Action.DELETE))) || (action == (BaseModel.Action.UPDATE))) {
            onContentChanged();
        }
    }
}