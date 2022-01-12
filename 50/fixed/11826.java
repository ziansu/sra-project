@net.mostlyoriginal.api.event.dispatcher.Benchmark
@net.mostlyoriginal.api.event.dispatcher.OperationsPerInvocation(value = 2)
public void eventWithMixedCalls() {
    dispatch(new net.mostlyoriginal.api.event.dispatcher.DispatcherBenchmark.EventNest0());
    dispatch(new net.mostlyoriginal.api.event.dispatcher.DispatcherBenchmark.EventNest0v2());
}