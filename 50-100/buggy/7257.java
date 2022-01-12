public void assertEquals(java.lang.Object actual, java.lang.Object expected) {
    if ((expected == null) && (actual == null))
        return ;
    
    if ((expected != null) && (expected.equals(actual)))
        return ;
    
    fail(format(expected, actual));
}