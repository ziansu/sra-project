public static void main(java.lang.String[] args) {
    com.hazelcast.core.HazelcastInstance hz = com.hazelcast.core.Hazelcast.newHazelcastInstance();
    hz.getLifecycleService().shutdown();
    com.hazelcast.core.ITopic<java.util.Date> topic = hz.getTopic("topic");
    topic.publish(new java.util.Date());
    java.lang.System.out.println("Published");
    java.lang.System.exit(0);
}