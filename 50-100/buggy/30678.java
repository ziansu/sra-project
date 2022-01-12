private void testEloquentCreate() {
    java.lang.String[] columnNames = new java.lang.String[]{ "name" , "gender" , "age" , "extra" };
    com.mozzandroidutils.sqlite.ColumnType[] columnTypes = new com.mozzandroidutils.sqlite.ColumnType[]{ com.mozzandroidutils.sqlite.ColumnType.TYPE_TEXT , com.mozzandroidutils.sqlite.ColumnType.TYPE_TEXT , com.mozzandroidutils.sqlite.ColumnType.TYPE_INTEGER , com.mozzandroidutils.sqlite.ColumnType.TYPE_BLOB };
    com.mozzandroidutils.sqlite.Eloquent.create("students", columnNames, columnTypes, this);
    com.mozzandroidutils.test.StudentsEloquent studentTable = new com.mozzandroidutils.test.StudentsEloquent(this);
    com.mozzandroidutils.sqlite.Model student = studentTable.find(7);
    java.lang.System.out.println(student.get("extra"));
}