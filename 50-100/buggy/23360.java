private void sendWindowRank() {
    java.lang.String get_json_ranking = ((java.lang.String) (memcachedClient.get("global_rank")));
    try {
        channel.basicPublish(EXCHANGE_NAME, ROUTING_KEY, null, get_json_ranking.getBytes());
        java.lang.System.out.println((((org.uniroma2.sdcc.Bolt.GlobalRankBolt.LOG_TAG) + "Sent : ") + get_json_ranking));
    } catch (java.io.IOException e) {
        e.printStackTrace();
        java.lang.System.out.println(((org.uniroma2.sdcc.Bolt.GlobalRankBolt.LOG_TAG) + "Failed sending mess to Rabbit."));
    }
}