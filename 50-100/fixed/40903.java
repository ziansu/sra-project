@org.junit.Test
public void test_difference_in_case() throws java.lang.Exception {
    map.putSync("Read_it", 42);
    map.putSync("Read_It", 43);
    de.mxro.async.jre.Async.waitFor(new de.mxro.async.Operation<de.mxro.fn.Success>() {
        @java.lang.Override
        public void apply(final de.mxro.async.callbacks.ValueCallback<de.mxro.fn.Success> callback) {
            map.commit(de.mxro.async.AsyncCommon.wrap(callback));
        }
    });
    org.junit.Assert.assertEquals(42, map.getSync("Read_it"));
    org.junit.Assert.assertEquals(43, map.getSync("Read_It"));
}