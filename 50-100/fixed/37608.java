@org.junit.Test
public void test_ToArrayT_RemoveInvalidValues() {
    int _invalid_value = getAnInvalidValue();
    this.sourceListRef.addAll(this.invalidListRef);
    java.lang.Integer[] _result = this.collectionListRef.toArray(new java.lang.Integer[this.collectionListRef.size()]);
    for (int _cpt = 0; _cpt < (_result.length); ++_cpt) {
        org.junit.Assert.assertNotEquals(_invalid_value, _result[_cpt].intValue());
    }
}