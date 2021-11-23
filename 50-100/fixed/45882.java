@java.lang.Override
public void apply(android.database.Cursor cursor, com.th3l4b.srm.model.runtime.IInstance instance) throws java.lang.Exception {
    int i = columnIndex();
    if (!(cursor.isNull(i))) {
        java.lang.String v = cursor.getString(i);
        runtime().set(v, instance);
    }
}