@java.lang.Override
public void test() throws java.lang.Exception {
    testConcurrentCreate();
    if (true)
        return ;
    
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