@java.lang.Override
public rx.Subscriber<? super T> call(rx.Subscriber<? super T> child) {
    final rx.observers.SerializedSubscriber<T> s = new rx.observers.SerializedSubscriber<T>(child);
    final rx.Scheduler.Worker worker = scheduler.createWorker();
    child.add(worker);
    rx.internal.operators.OperatorSampleWithTime.SamplerSubscriber<T> sampler = new rx.internal.operators.OperatorSampleWithTime.SamplerSubscriber<T>(s);
    worker.schedulePeriodically(sampler, time, time, unit);
    return sampler;
}