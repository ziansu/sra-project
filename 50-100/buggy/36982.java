@java.lang.Override
public final java.util.Set<de.uniulm.omi.cloudiator.visor.monitoring.Measurement<E>> getMeasurements() throws de.uniulm.omi.cloudiator.visor.exceptions.MeasurementNotAvailableException {
    com.google.common.base.Preconditions.checkState(isInitialized, "Measurement method was called before initialization.");
    java.util.Set<de.uniulm.omi.cloudiator.visor.monitoring.Measurement<E>> measurements = measureSet();
    if (measurements.isEmpty()) {
        de.uniulm.omi.cloudiator.visor.monitoring.Measurement<E> single = measureSingle();
        if (single != null) {
            return java.util.Collections.singleton(measureSingle());
        }
        throw new de.uniulm.omi.cloudiator.visor.exceptions.MeasurementNotAvailableException(((this) + "does not implement measureSingle or measureSet"));
    }
    return measureSet();
}