@com.fasterxml.jackson.annotation.JsonCreator
public static org.graylog.plugins.collector.collectors.rest.models.CollectorMetrics create(@com.fasterxml.jackson.annotation.JsonProperty(value = "disks_75")
@javax.annotation.Nullable
java.util.List<java.lang.String> disks75, @com.fasterxml.jackson.annotation.JsonProperty(value = "cpu_idle")
@javax.annotation.Nullable
java.lang.Float cpuIdle, @com.fasterxml.jackson.annotation.JsonProperty(value = "load_1")
@javax.annotation.Nullable
java.lang.Float load1) {
    return new org.graylog.plugins.collector.collectors.rest.models.AutoValue_CollectorMetrics(disks75, cpuIdle, load1);
}