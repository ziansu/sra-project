@java.lang.Override
public void close() {
    super.close();
    org.apache.spark.unsafe.Platform.freeMemory(nulls);
    org.apache.spark.unsafe.Platform.freeMemory(data);
    org.apache.spark.unsafe.Platform.freeMemory(lengthData);
    org.apache.spark.unsafe.Platform.freeMemory(offsetData);
    nulls = 0;
    data = 0;
    lengthData = 0;
    offsetData = 0;
}