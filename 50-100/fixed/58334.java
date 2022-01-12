public void testDuplicateNameFullNameMapper() throws java.lang.Exception {
    org.apache.ignite.internal.binary.BinaryMarshaller marsh = binaryMarshaller(new org.apache.ignite.binary.BinaryBasicNameMapper(false), new org.apache.ignite.binary.BinaryBasicIdMapper(false), null, null, null);
    org.apache.ignite.internal.binary.BinaryMarshallerSelfTest.Test1.Job job1 = new org.apache.ignite.internal.binary.BinaryMarshallerSelfTest.Test1().new Job();
    org.apache.ignite.internal.binary.BinaryMarshallerSelfTest.Test2.Job job2 = new org.apache.ignite.internal.binary.BinaryMarshallerSelfTest.Test2().new Job();
    marsh.marshal(job1);
    marsh.marshal(job2);
}