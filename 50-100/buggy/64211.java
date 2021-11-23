@java.lang.Override
public void setup(org.apache.drill.exec.physical.impl.OutputMutator output) throws org.apache.drill.common.exceptions.ExecutionSetupException {
    this.writer = new org.apache.drill.exec.vector.complex.impl.VectorContainerWriter(output);
    this.jsonReader = new org.apache.drill.exec.vector.complex.fn.JsonReader(fragmentContext.getManagedBuffer(), com.google.common.collect.Lists.newArrayList(getColumns()), enableAllTextMode, readNumbersAsDouble, false);
    org.apache.drill.exec.store.mongo.MongoRecordReader.logger.info(("Filters Applied : " + (filters)));
    org.apache.drill.exec.store.mongo.MongoRecordReader.logger.info(("Fields Selected :" + (fields)));
    cursor = collection.find(filters, fields);
}