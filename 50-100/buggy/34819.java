@org.infinispan.stress.DataProvider(name = "readWriteRemove")
public java.lang.Object[][] independentReadWriteRemoveParams() {
    return new java.lang.Object[][]{ new java.lang.Object[]{ CAPACITY , 3 * (CAPACITY) , 32 , 90 , 9 , 1 } , new java.lang.Object[]{ CAPACITY , 3 * (CAPACITY) , 32 , 9 , 1 , 0 } };
}