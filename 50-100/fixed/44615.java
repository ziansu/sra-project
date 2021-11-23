@org.junit.contrib.theories.Theory
public void testListOfStringSoft(@com.pholser.junit.quickcheck.ForAll
java.util.List<java.lang.String> ls) throws java.lang.Exception {
    java.lang.String curr;
    java.lang.String prev = null;
    ls.sort(java.util.Comparator.<java.lang.String>naturalOrder());
    for (java.lang.String aStr : ls) {
        if (null == prev)
            prev = aStr;
        
        curr = aStr;
        assertThat("Elements should be sorted", ((curr.compareTo(prev)) > (-1)), is(true));
        prev = curr;
    }
}