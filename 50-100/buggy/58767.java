public static void main() {
    java.lang.System.out.println(("Connecting to zookeeper: " + "ktask-nod1:2181,ktask-nod2:2181,ktask-nod3:2181,ktask-nod4:2181"));
    final kafka.utils.ZkUtils zkUtils = org.cripac.isee.vpe.util.kafka.KafkaHelper.createZKUtils("ktask-nod1:2181,ktask-nod2:2181,ktask-nod3:2181,ktask-nod4:2181", 30000, 300000);
    org.cripac.isee.vpe.util.kafka.KafkaHelper.createTopicIfNotExists(zkUtils, "topicForURLTest", 10, 2);
    java.lang.System.out.println("Topics checked!");
}