@java.lang.Override
public void insert(long startFrom, org.exbin.utils.binary_data.BinaryData insertedData, long insertedDataOffset, long insertedDataLength) {
    long dataSize = insertedData.getDataSize();
    insertUninitialized(startFrom, dataSize);
    replace(startFrom, insertedData, insertedDataOffset, insertedDataLength);
}