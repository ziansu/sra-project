@java.lang.Override
public void process(org.apache.beam.sdk.values.TupleTag tag, org.apache.beam.sdk.util.WindowedValue elem) {
    org.apache.beam.runners.core.KeyedWorkItem<K, V> keyedWorkItem = com.alibaba.jstorm.beam.util.RunnerUtils.toKeyedWorkItem(((org.apache.beam.sdk.util.WindowedValue<org.apache.beam.sdk.values.KV<K, V>>) (elem)));
    runner.processElement(elem.withValue(keyedWorkItem));
}