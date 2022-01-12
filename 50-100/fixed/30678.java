private void testEloquentCreate() {
    java.lang.String[] columnNames = new java.lang.String[]{ "name" , "gender" , "age" , "extra" };
    com.mozzandroidutils.sqlite.ColumnType[] columnTypes = new com.mozzandroidutils.sqlite.ColumnType[]{ com.mozzandroidutils.sqlite.ColumnType.TYPE_TEXT , com.mozzandroidutils.sqlite.ColumnType.TYPE_TEXT , com.mozzandroidutils.sqlite.ColumnType.TYPE_INTEGER , com.mozzandroidutils.sqlite.ColumnType.TYPE_BLOB };
    com.mozzandroidutils.sqlite.Eloquent.create("students", columnNames, columnTypes, this);
}