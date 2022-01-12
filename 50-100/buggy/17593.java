public static void record(util.StatisticPrinter.StatisticKey key, java.lang.Long value) {
    java.lang.System.out.println(((("key: " + key) + "value: ") + value));
    synchronized(util.StatisticPrinter.statistic) {
        if (key.equals(util.StatisticPrinter.StatisticKey.LOGIQL_PREDICATES_SIZE)) {
            util.StatisticPrinter.statistic.put(key, value);
        }else {
            long oldValue = util.StatisticPrinter.statistic.get(key);
            util.StatisticPrinter.statistic.put(key, (value + oldValue));
        }
    }
}