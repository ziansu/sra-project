public static void main(java.lang.String[] args) throws java.lang.Exception {
    org.apache.apex.malhar.stream.api.impl.StreamFactory.fromFolder("some folder").addCompositeStreams(new org.apache.apex.malhar.stream.sample.cookbook.TriggerExample.CalculateTotalFlow(60));
}