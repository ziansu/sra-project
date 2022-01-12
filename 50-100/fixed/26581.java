@java.lang.SuppressWarnings(value = "rawtypes")
public java.lang.Object apply(java.util.List args) {
    if ((args.size()) == 1) {
        java.util.List firstArg = ((java.util.List) (args.get(0)));
        return firstArg.subList(1, firstArg.size());
    }else {
        return Environment.FALSE;
    }
}