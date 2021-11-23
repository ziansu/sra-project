@org.junit.Test
public void testAsLogicalVector() {
    arg.asLogicalVector();
    assertTypes(com.oracle.truffle.r.runtime.data.RNull.class, com.oracle.truffle.r.runtime.data.RMissing.class, byte.class, com.oracle.truffle.r.runtime.data.RLogicalVector.class, com.oracle.truffle.r.runtime.data.RArgsValuesAndNames.class);
}