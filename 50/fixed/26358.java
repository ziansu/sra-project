public void registerReactionSubscriber(java.lang.Object viewClass) {
    java.util.concurrent.ExecutorService reactionExecuter = java.util.concurrent.Executors.newFixedThreadPool(1);
    reactionExecuter.execute(new com.nigelbrown.fluxion.Flux.MethodsWithReactAnnotationHelperRunnable(viewClass));
}