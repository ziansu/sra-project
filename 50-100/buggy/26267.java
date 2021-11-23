public static void main(java.lang.String[] args) throws java.lang.Throwable {
    eu.modernmt.processing.framework.newstring.TokenHookArray array = new eu.modernmt.processing.framework.newstring.TokenHookArray();
    array.addHook(new eu.modernmt.processing.framework.newstring.TokenHook(null, 0, 10, null, null, 100));
    array.addHook(new eu.modernmt.processing.framework.newstring.TokenHook(null, 5, 1, null, null, 1000));
    for (eu.modernmt.processing.framework.newstring.TokenHook hook : array) {
        java.lang.System.out.println(hook);
    }
}