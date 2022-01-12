@java.lang.SuppressWarnings(value = "rawtypes")
@java.lang.Override
public rx.Subscriber<? super rx.Observable[]> call(final rx.Subscriber<? super R> child) {
    final rx.internal.operators.OperatorZip.Zip<R> zipper = new rx.internal.operators.OperatorZip.Zip<R>(child, zipFunction);
    final rx.internal.operators.OperatorZip.ZipProducer<R> producer = new rx.internal.operators.OperatorZip.ZipProducer<R>(zipper);
    child.setProducer(producer);
    final rx.internal.operators.OperatorZip<R>.ZipSubscriber subscriber = new ZipSubscriber(child, zipper, producer);
    return subscriber;
}