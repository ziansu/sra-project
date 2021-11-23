@java.lang.Override
public void initialize() {
    for (org.apache.crunch.MapFn fn : fns) {
        fn.initialize();
    }
    tupleFactory.initialize();
}