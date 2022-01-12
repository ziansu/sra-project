@java.lang.Override
public void test() throws java.lang.Exception {
    testConcurrentCreate();
    testSchemaSearchPath();
    testAlterSequenceColumn();
    testAlterSequence();
    testCache();
    testTwo();
    testMetaTable();
    testCreateWithMinValue();
    testCreateWithMaxValue();
    testCreationErrors();
    testCreateSql();
    testDefaultMinMax();
    deleteDb("sequence");
}