@java.lang.Override
public void insert(long startFrom, org.exbin.utils.binary_data.BinaryData insertedData, long insertedDataOffset, long insertedDataLength) {
    insertUninitialized(startFrom, insertedDataLength);
    replace(startFrom, insertedData, insertedDataOffset, insertedDataLength);
}