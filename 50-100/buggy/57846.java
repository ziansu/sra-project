@org.junit.Test
public void testUnion() {
    for (org.checkerframework.common.value.Range range1 : ranges) {
        for (org.checkerframework.common.value.Range range2 : ranges) {
            for (long value : values) {
                org.checkerframework.common.value.Range result = range1.union(range2);
                if ((range1.contains(value)) || (range2.contains(value))) {
                    assert result.contains(value) : java.lang.String.format("Range.union failure: %s %s %s; witness = %s", range1, range2, result, value);
                }
            }
        }
    }
}