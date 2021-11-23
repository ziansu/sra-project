@java.lang.Override
public void onModelStateChanged(@android.support.annotation.Nullable
java.lang.Class<?> table, com.raizlabs.android.dbflow.structure.BaseModel.Action action, @android.support.annotation.NonNull
com.raizlabs.android.dbflow.sql.language.SQLCondition[] primaryKeyValues) {
    if (!(this.endOfTransaction)) {
        if (((action == (BaseModel.Action.INSERT)) || (action == (BaseModel.Action.DELETE))) || (action == (BaseModel.Action.UPDATE))) {
            onContentChanged();
        }
    }
}