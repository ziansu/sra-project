@java.lang.Override
public void onNext(T t) {
    if ((s) == null)
        throw reactor.core.processor.CancelException.INSTANCE;
    
    this.decrementRequested();
    reactor.rx.action.combination.ConcatAction.ConcatInnerSubscriber.broadcastNext(t);
}