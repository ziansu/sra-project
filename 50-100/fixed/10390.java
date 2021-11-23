@java.lang.Override
public com.simpledb.result.Result call() throws java.lang.Exception {
    com.simpledb.memtable.Memtable<java.lang.String, java.lang.String> memtable = processor.getMemTable();
    java.lang.Object value = memtable.getValue(input.trim());
    com.simpledb.result.Result result = null;
    if (value != null) {
        result = new com.simpledb.result.Result(value.toString());
    }else {
        result = new com.simpledb.result.Result("the data should be in the LookupIndex Stack... but this hasn't been implemented yet :(");
    }
    outputResult(result);
    return result;
}