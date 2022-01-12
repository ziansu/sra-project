@org.junit.Before
public void setUp() {
    source = eu.pawelsz.apache.beam.io.protoio.ProtoIOSource.from(Data.RawItem.class, eu.pawelsz.apache.beam.io.protoio.ProtoIOCloudStorageTest.testFilePath);
}