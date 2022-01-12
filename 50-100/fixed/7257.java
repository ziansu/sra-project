public void assertEquals(java.lang.Object expected, java.lang.Object actual) {
    if ((expected == null) && (actual == null))
        return ;
    
    if ((expected != null) && (expected.equals(actual)))
        return ;
    
    fail(format(expected, actual));
}