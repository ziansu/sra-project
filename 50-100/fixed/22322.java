public static void main(java.lang.String... args) {
    com.pragmasol.demo.CassandraSession.init("192.168.56.101");
    com.pragmasol.demo.BalanceRetriever retriever = new com.pragmasol.demo.BalanceRetriever(com.pragmasol.demo.CassandraSession.getSession());
    com.pragmasol.demo.BalanceCalculator balance = retriever.getCurrentBalance(org.joda.time.DateTime.now().plusDays(2), args[0], args[1]);
    java.lang.System.out.println(balance.toString());
    com.pragmasol.demo.CassandraSession.close();
}