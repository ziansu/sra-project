@java.lang.Override
public void initialize() {
    for (org.apache.crunch.MapFn fn : fns) {
        fn.initialize();
    }
    this.values = new java.lang.Object[fns.size()];
    tupleFactory.initialize();
}