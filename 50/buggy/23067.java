@org.junit.Test
public void test_toArrayT_InvalidArraySize_FirstCellWithNull() {
    int _nb_of_elements = this.setupWithDifferentValues();
    org.junit.Assert.assertNull(this.redundantSetTesting.toArray(new java.lang.Integer[_nb_of_elements + 1])[0]);
}