public static java.lang.Object TryExecute(TimeoutInvoke.Func expression, java.lang.Object param, long timeoutMs) throws java.lang.InterruptedException {
    java.lang.Object[] toReturn = new java.lang.Object[0];
    java.lang.Runnable r = new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            toReturn[0] = expression.run(param);
        }
    };
    TimeoutInvoke.TryExecute(r, timeoutMs);
    return toReturn[0];
}