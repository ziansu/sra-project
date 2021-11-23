@org.junit.After
public void tearDown() throws java.lang.Exception {
    final delight.async.Operation<delight.functional.Success> _function = new delight.async.Operation<delight.functional.Success>() {
        @java.lang.Override
        public void apply(final delight.async.callbacks.ValueCallback<delight.functional.Success> callback) {
            delight.async.callbacks.SimpleCallback _asSimpleCallback = delight.async.AsyncCommon.<delight.functional.Success>asSimpleCallback(callback);
            delight.keyvalue.sql.tests.TestSqlStore.this.map.stop(_asSimpleCallback);
        }
    };
    delight.async.jre.Async.<delight.functional.Success>waitFor(_function);
}