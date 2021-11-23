public static void main(java.lang.String[] args) throws java.lang.Exception {
    for (int i = 0; i < 10000; i++) {
        com.uumind.log4j.appender.redis.RedisAppenderTest.log.info("Log Test");
    }
    java.lang.System.out.println("Done");
}