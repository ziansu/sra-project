@java.lang.Override
public void subscribeAll(java.util.function.Consumer<? super T> onNext, java.util.function.Consumer<? super java.lang.Throwable> onError, java.lang.Runnable onCompleteDs) {
    run = () -> {
        boolean canAdvance = true;
        while (canAdvance) {
            try {
                canAdvance = split.tryAdvance(onNext);
            } catch (java.lang.Throwable t) {
                onError.accept(t);
            }
        } 
        closed = true;
        onCompleteDs.run();
    };
    run.run();
}