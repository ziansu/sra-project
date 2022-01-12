public static com.bigcustard.blurp.model.java.bootstrap.JavaBootstrapHolder initialise(com.bigcustard.blurp.model.java.bootstrap.JavaBootstrap javaBootstrap) {
    if ((com.bigcustard.blurp.model.java.bootstrap.JavaBootstrapHolder.SingletonHolder.INSTANCE.delegate) == null) {
        com.bigcustard.blurp.model.java.bootstrap.JavaBootstrapHolder.SingletonHolder.INSTANCE.delegate = javaBootstrap;
    }
    return com.bigcustard.blurp.model.java.bootstrap.JavaBootstrapHolder.SingletonHolder.INSTANCE;
}