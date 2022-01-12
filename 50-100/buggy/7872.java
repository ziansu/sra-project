@org.junit.Test
public void TestGetDbColumnInfo() {
    com.github.wz2cool.dynamic.mybatis.ColumnInfo result = com.github.wz2cool.dynamic.mybatis.EntityCache.getInstance().getColumnInfo(com.github.wz2cool.model.Student.class, "name");
    org.junit.Assert.assertEquals("name", result.getColumnName());
    org.junit.Assert.assertEquals(false, result.isUpdateIfNull());
    result = com.github.wz2cool.dynamic.mybatis.EntityCache.getInstance().getColumnInfo(com.github.wz2cool.model.Student.class, "note");
    org.junit.Assert.assertEquals("dbColumn.note", result.getColumnName());
    org.junit.Assert.assertEquals(true, result.isUpdateIfNull());
}